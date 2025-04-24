package alist;

import com.sun.security.jgss.GSSUtil;


import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class basic {
    public static void main(String[] args) {
        ArrayList<Integer>l1=new ArrayList<>();
        l1.add(2);
        l1.add(5);
        l1.add(3);
        l1.add(1);
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());

        System.out.println(l1.get(1));



        for (int i=0;i<l1.size();i++)
        {
            System.out.print(l1.get(i));
        }

        System.out.println(l1);



        l1.add(1,100);
        l1.set(1,10);
        l1.remove(2);
        l1.remove(Integer.valueOf(3));



        boolean ans=l1.contains(Integer.valueOf(5));
        System.out.println(ans);



        ArrayList l=new ArrayList();
        l.add("abvdd");
        l.add(22);
        l.add(true);
        System.out.println(l);



        ArrayList <Integer> l2=new ArrayList<>();
        l2.add(4);
        l2.add(2);
        l2.add(3);
        l2.add(5);
        l2.add(1);
        System.out.println(l2);
        Collections.reverse(l2);
        System.out.println(l2);
        Collections.sort(l2);
        System.out.println(l2);
        Collections.sort(l2,Collections.reverseOrder());
        System.out.println(l2);


        ArrayList <String> s=new ArrayList<>();
        s.add("i");
        s.add("am");
        s.add("list");
        s.add("of");
        s.add("string");
        System.out.println(s);

        Collections.sort(s);
        System.out.println(s);
        Collections.sort(s,Collections.reverseOrder());
        System.out.println(s);




    }



}
