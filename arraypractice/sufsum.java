package arraypractice;

import java.util.Scanner;

public class sufsum {
    public static int [] createarr(int n , Scanner sc)
    {
        int arr[]=new int[n];
        System.out.println("enter elements of array");
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static int [] suffix(int[]arr)
    {
        for (int i=arr.length-2;i>=0;i--)
        {
            arr[i]+=arr[i+1];
        }
        return arr;
    }
    public static void printarr(int [] arr)
    {
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of elemnts");
        int n=sc.nextInt();
        int [] arr=createarr(n,sc);
        suffix(arr);
        printarr(arr);


    }
}
