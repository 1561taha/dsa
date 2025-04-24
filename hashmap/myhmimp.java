package hashmap;

import java.util.LinkedList;

public class myhmimp {

  public static  class Myhashmap<k,v> {
      private final float Def_load= 0.75f;
      private final int st_cap=4;
      private int n=0;

      class Node{
          k key;
          v val;

          Node (k key , v val){
              this .key=key;
              this .val=val;
          }
      }

      LinkedList<Node> [] buckets;

      Myhashmap(){
          createbuckets(st_cap);
      }

      private void createbuckets(int N){
          buckets= new LinkedList[N];
          for (int i=0;i<buckets.length;i++){
              buckets[i]= new LinkedList<>();
          }
      }

      private int hashfunc( k key){
          int hc=key.hashCode();
          return (Math.abs(hc))%buckets.length;
      }

      private int searchbucket(k key , LinkedList<Node> ll){
          for (int i=0;i<ll.size();i++){
              if (ll.get(i).key== key) return i;
          }
          return -1;
      }

      void put (k key , v val){
          int bi= hashfunc(key);
          LinkedList<Node> currb= buckets[bi];
          int ei=searchbucket(key,currb);
          if (ei==-1){
              Node node= new Node(key , val);
              currb.add(node);
              n++;
          }
          else {
              Node currn=currb.get(ei);
              currn.val=val;
          }

          if (n>=Def_load*buckets.length){
              rehash();
          }

      }

      private void rehash(){
          n=0;
          LinkedList<Node>[] oldb=buckets;
          createbuckets(oldb.length*2);
          for (var i: oldb){
              for (var node : i){
                  put(node.key, node.val);
              }
          }

      }

      v get (k key){
          int bi=hashfunc(key);
          LinkedList<Node> currb= buckets[bi];
          int ei=searchbucket(key, currb);
          if (ei!=-1){
              Node currn=currb.get(ei);
              return currn.val;
          }
          return null;

      }

      v remove (k key){
          int bi =hashfunc(key);
          LinkedList<Node> currb=buckets[bi];
          int ei=searchbucket(key, currb);
          if (ei!=-1){
              Node currn=currb.get(ei);
              v val=currn.val;
              currb.remove(ei);
              n--;
              return val;
          }
          return null;

      }

      int size (){
          return n;
      }
      int cap(){
        return   buckets.length;
      }

      float load(){
          return (n*1.0f)/buckets.length;
      }



  }

    public static void main(String[] args) {

        Myhashmap<Integer,String> mh= new Myhashmap<>();
        mh.put(1,"hey");
        mh.put(2, " bye");
        mh.put(3,"hello");

        System.out.println(mh.get(3));
        System.out.println(mh.size());
        mh.put(3,"heyoo");
        System.out.println(mh.get(3));
        System.out.println(mh.size());
        mh.remove(2);
        System.out.println(mh.get(2));
        System.out.println(mh.size());
        mh.put(2,"jkl");
        System.out.println(mh.get(2));
        System.out.println(mh.size());
        mh.put(4,"klm");
        System.out.println(mh.get(4));
        System.out.println(mh.size());
        System.out.println(mh.cap());
        System.out.println(mh.load());

//        hello
//        3
//        heyoo
//        3
//        null
//        2
//        jkl
//        3
//        klm
//        4
//        8
//        0.5




    }
}
