package arraypractice;

import java.awt.*;
import java.util.Scanner;

public class prefixsum {
    public static int [] createarr(int n , Scanner sc)
    {
        int arr[]=new int[n];
        System.out.println("enter elements of array");
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
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
    public static int [] prefsum(int[]arr)
    {
        for (int i=1;i<arr.length;i++)
        {
            arr[i]+=arr[i-1];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no of elemnts");
        int n=sc.nextInt();
        int[]arr=createarr(n,sc);
        prefsum(arr);
        printarr(arr);



    }
}
