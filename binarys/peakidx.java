package binarys;

import java.util.Scanner;

public class peakidx {
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
    public static  int  idxpeak(int [] arr, int n)
    {
        int st=0; int end =n-1;
        int ans=-1;
        while (st<=end)
        {
            int mid=st+(end-st)/2;

            if (arr[mid]<arr[mid+1])
            {
                ans=mid+1;
                st=mid+1;

            }
            else {
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        System.out.println("enter size  of array");
        int n=sc.nextInt();
        int []arr=createarr(n,sc);
        System.out.println("the index of peak element is "+ idxpeak(arr,n));

    }
}
