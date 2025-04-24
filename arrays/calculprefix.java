package arrays;

import java.util.Scanner;

public class calculprefix {
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
    public static void printarry(int [] arr)
    {
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }

    public static int []prefix(int arr[])
    {
        for (int i=1;i<arr.length;i++)
        {
            arr[i]+=arr[i-1];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int n=sc.nextInt();
        int []arr= createarr(n);
        printarry(arr);
        prefix(arr);
        printarry(arr);



    }
}
