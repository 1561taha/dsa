package oops;

import java.util.Arrays;

public class createarraylist {
    public static class Arraylist{
       int [] arr=new int[2];
        int idx=0;
        int size;
        public void add(int el)
        {
            if (size==arr.length)
            {
                int [] brr= Arrays.copyOf(arr,arr.length*2);
                arr=brr;
            }
            arr[idx++]=el;
            size++;
        }
        public   void  set(int idx, int el){
            arr[idx]=el;

        }
        public int get (int idx)
        {
            return arr[idx];
        }


    }

    public static void main(String[] args) {
        Arraylist arr= new Arraylist();
        arr.add(2);
        arr.add(4);
        System.out.println(arr.size);
        arr.add(8);
        System.out.println(arr.size);
        arr.add(5);
        arr.set(2,10);
        System.out.println(arr.get(2));



    }
}
