package recursprac;

import java.util.Scanner;

public class umofsubsets {
    public static int[] craetearr(int[]arr, int idx,Scanner sc)
    {
        if (idx==arr.length)
        {
            return arr;
        }
        arr[idx]=sc.nextInt();
        craetearr(arr,idx+1,sc);
        return arr;

    }
    public static void printarr(int[]arr,int idx)
    {
        if (idx==arr.length)
        {
            return;
        }
        System.out.print(arr[idx]+" ");
        printarr(arr,idx+1);
    }
    public static void sum(int[] arr,int idx, int csum)
    {
        if (idx==arr.length)
        {
            System.out.println(csum);
            return;
        }
        sum(arr,idx+1,csum+arr[idx]);
        sum(arr,idx+1,csum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int []arr=new int[n];
        arr=craetearr(arr,0,sc);
        printarr(arr,0);
        System.out.println();
        sum(arr,0,0);



    }
}
