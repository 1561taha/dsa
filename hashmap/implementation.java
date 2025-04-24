package hashmap;

import linkedlist.implementll;

import java.util.LinkedList;

public class implementation {
    public static  class MyHashmap<k,v>{
        private final float Def_load=0.75f;
        private int init_cap=4;

        class Node {
            k key;
            v value;
            Node (k key, v value){
                this.key=key;
                this.value=value;
            }
        }

        LinkedList<Node> []buckets;
        int n=0;

        MyHashmap(){
            createbuckets(init_cap);
        }

        private void createbuckets(int N){
            buckets=new LinkedList[N];
            for (int i=0;i< buckets.length;i++){
                buckets[i]=new LinkedList<>();
            }
        }
        private int hashfunc(k key){
            int hc=key.hashCode();
            return (Math.abs(hc))% buckets.length;
        }
        private int searchinbucket(k key , LinkedList<Node> ll){
            for (int i=0;i<ll.size();i++){
                if (ll.get(i).key==key) return i;
            }
            return -1;
        }
        void put(k key, v value){
            int bi=hashfunc(key);
            LinkedList<Node> currb=buckets[bi];
            int ei=searchinbucket(key,currb);
            if(ei==-1){
                Node node=new Node(key,value);
                currb.add(node);
                n++;
            }
            else{
                Node currn= currb.get(ei);
                currn.value=value;
            }
            if (n>=Def_load*buckets.length){
                rehash();
            }
        }

        private void rehash(){
            LinkedList<Node> [] oldb=buckets;
            createbuckets(oldb.length*2);
           for (var i : oldb){
               for(var node: i){
                   put(node.key,node.value);
               }
           }

        }

        v get (k key){
            int bi= hashfunc(key);
            LinkedList<Node> currb=buckets[bi];
            int ei=searchinbucket(key,currb);
            if (ei!=-1){
                Node currn=currb.get(ei);
                v val=currn.value;
                return val;
            }
            return null;


        }

        v remove(k key){
            int bi=hashfunc(key);
            LinkedList<Node>currb=buckets[bi];
            int ei=searchinbucket(key, currb);
            if (ei!=-1){
                Node currn=currb.get(ei);
                v val= currn.value;
                n--;
                currb.remove(ei);
                return val;
            }
            return null;

        }

        int size(){
            return n;
        }


    }
    public static void main(String[] args) {

        MyHashmap <Integer,String> mh= new MyHashmap<>();
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
//        System.out.println(mh.cap());
//        System.out.println(mh.load());


    }
}
