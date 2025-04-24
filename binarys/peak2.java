package binarys;

import java.util.Scanner;

public class peak2 {
    public static int[] createarr(int n, Scanner sc)
    {
        int [] arr= new int[n];
        System.out.println("enter "+ n+ " elements ");
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        return arr;
    }
    public static int findpeak(int []arr, int n)
    {
        int st=0,end=n-1;
        while (st<=end)
        {
            int mid=st+(end-st)/2;
            if ((mid==0 || arr[mid]>arr[mid-1])&& (mid==n-1 || arr[mid]>arr[mid+1]))
            {
                return  mid;
            } else if (arr[mid]<arr[mid+1]) {
                st=mid+1;

            }
            else {
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=createarr(n,sc);
        System.out.println("peak is at "+ findpeak(arr,n));

    }
}
