package arraypractice;

import java.util.Scanner;

public class maxval {
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
    public static  void printarr(int n,int arr[])
    {
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static int max(int arr[])
    {
        int m=arr[0];
        for (int i=1;i<arr.length;i++)
        {
            if (arr[i]>arr[i-1])
            {
                m=arr[i];
            }
        }
        return m;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr =createarr(n,sc);

        System.out.println(max(arr));

    }
}
