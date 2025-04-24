package arrays;

import java.util.Scanner;

public class sumofrange {
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

    public static int [] prefix(int arr[], int n)
    {
        for (int i=1;i<n;i++)
        {
            arr[i]+=arr[i-1];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size");
        int n=sc.nextInt();
        int [] arr=createarr(n);
        printarry(arr);
        prefix(arr,n);
        printarry(arr);
        System.out.println("enter number of queries");
        int q=sc.nextInt();
        for (; q > 0; q--) {
            System.out.println("enter start");
            int s = sc.nextInt();
            System.out.println("enter end");
            int e = sc.nextInt();

            int sum = arr[e] - arr[s-1] ;
            System.out.println("sum " + sum);
        }



    }
}
