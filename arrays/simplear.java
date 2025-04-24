package arrays;

import java.util.Scanner;

public class simplear {
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

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter count");
        int n=sc.nextInt();
        int arr[]=createarr(n);

        for (int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
