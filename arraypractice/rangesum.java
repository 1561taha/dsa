package arraypractice;

import java.util.Scanner;

public class rangesum {
    public static int [] createarr(int n , Scanner sc)
    {
        int arr[]=new int[n+1];
        System.out.println("enter elements of array");
        for (int i=1;i<=n;i++)
        {
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static int [] presum(int []arr,int n)
    {
        for (int i=1;i<=n;i++)
        {
            arr[i]+=arr[i-1];
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
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no of elemnts");
        int n=sc.nextInt();
        int []arr=createarr(n,sc);
        presum(arr,n);
        printarr(arr);
        System.out.println("enter no og queries");
        int q=sc.nextInt();
        while (q>0)
        {
            System.out.println("enter start of range");
            int x=sc.nextInt();
            System.out.println("enter end of range");
            int y=sc.nextInt();
            System.out.println("sum of range is" + (arr[y]-arr[x-1]));
            q--;
        }


    }
}
