package arrays;

import java.util.Scanner;

public class targettwosum {
    public static int[] createarr(int n)
    {
        Scanner sc= new Scanner(System.in);
        int arr[]=new int[n];
        System.out.println("enter elements of array");
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static int  targetdouble(int arr[],int t)
    {
        int tar=0;
        for (int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if (arr[i]+arr[j]==t)
                {
                    tar++;
                }
            }

        }
        return tar;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int []arr=createarr(n);
        System.out.println("enter target");
        int t=sc.nextInt();

        System.out.println(targetdouble(arr,t));


    }
}
