package arraylist;

import java.util.ArrayList;

public class basic {
    public static void main(String[] args) {
   ArrayList<Integer> l1= new ArrayList<>();

   //add new elemnt
        l1.add(0);
        l1.add(2);
        //get element
        System.out.println(l1.get(0));
    //using loop
        for (int i=0;i<l1.size();i++)
        {
            System.out.println(l1.get(i));
        }
        //directly
        System.out.println(l1);
        //adding element at some i
        l1.add(1,100);
        //mpdifying element
        l1.set(1,3);
        //removing elemnt at i
        l1.remove(1);
        //remove element e
        l1.remove(Integer.valueOf(1));
        //check element
        boolean ans =l1.contains(Integer.valueOf(1));

        System.out.println();
        //if u dont specify class u can put anything in arraylist
        ArrayList l2=new ArrayList();
        l2.add(2);
        l2.add("dhhdh");
        l2.add(true);
    }




}
