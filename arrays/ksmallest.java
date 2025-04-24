package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ksmallest {
    public static int[] createarray(int n)
    {
        Scanner sc= new Scanner(System.in);
        int [] arr=new int[n];
        System.out.println("enter array elements");
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();

        }
        return arr;
    }
    public static  int ksmallest (int arr[],int k)
    {
        Arrays.sort(arr);
        int ksmall=arr[0];
        for (int i=0;i<arr.length;i++)
        {
            ksmall=arr[k-1];
        }
        return ksmall;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int arr[]=createarray(n);
        System.out.println("enter k");
        int k=sc.nextInt();
        int ksmall=ksmallest(arr,k);
        System.out.println(ksmall);


    }
}
