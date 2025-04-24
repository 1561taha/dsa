package recursprac;

import java.util.ArrayList;
import java.util.Scanner;

public class xexist {
    public static int[] createarr(int []arr,int idx, Scanner sc)
    {
        if (idx==arr.length)
        {
            return arr;
        }

        arr[idx]=sc.nextInt();
        createarr(arr,idx+1,sc);

        return arr;

    }







    public static boolean exist(int []arr, int idx,int x)
    {
        if (idx==arr.length)
        {
            return false;
        }
        if (arr[idx]==x) {
            return true;
        }
        else {
            return exist(arr,idx+1,x);
        }
    }
    public static int existindex(int []arr, int idx, int x)
    {
        if (idx==arr.length)
        {
            return -1;
        }
        if (arr[idx]==x) {
            return idx;
        }
        else {
            return existindex(arr, idx + 1, x);
        }
    }
    public static void allindex(int []arr,int idx, int x)
    {
        if (idx==arr.length)
        {
            return ;
        }
        if (arr[idx]==x)
        {
            System.out.println(idx+" ");
        }
        allindex(arr,idx+1,x);
    }
    public static ArrayList<Integer>all(int []arr,int idx , int x)
    {
        ArrayList<Integer> l1= new ArrayList<>();

        if (idx==arr.length)
        {
            return l1;
        }

        if (arr[idx]==x)
        {
            l1.add(idx);
        }


            ArrayList<Integer>ans=all(arr,idx+1,x);
        l1.addAll(ans);
        return l1;


    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        System.out.println("enter "+ n+"elemnts");
        int []arr=new int[n];
        arr=createarr(arr,0,sc);

        System.out.println("enter x");
        int x=sc.nextInt();
        System.out.println("does x exist?- "+exist(arr,0,x));
        System.out.println("index of x is- "+ existindex(arr,0,x));
        System.out.println("allindexof x are");
        allindex(arr,0,x);

        ArrayList<Integer> l1=all(arr,0,x);
        System.out.println(l1);




    }
}
