package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class searcharrlist {
    public static ArrayList<Integer> search(int[]arr,int target,int idx)
    {
        ArrayList<Integer> a=new ArrayList<>();
        if (idx==arr.length)
        {
            return new ArrayList<>();
        }
        if (arr[idx]==target)
        {
            a.add(idx);
        }
       ArrayList<Integer> c= search(arr,target,idx+1);
        a.addAll(c);
        return a;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int [] arr={1,2,4,5,4,3,4};
        System.out.println("enter target");
        int x=sc.nextInt();
        ArrayList<Integer> b=search(arr,x,0);
        System.out.println(b);
//        for (Integer i:b)
//        {
//            System.out.println(i);
//
//        }

    }
}
