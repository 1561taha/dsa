package binarys;

import java.util.Scanner;

public class racetrack {
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
    public static  boolean divpossible(int[]arr,int k,int mid)
    {
        int currk=1;
        int p=arr[0];
        for (int i=1;i<arr.length;i++)
        {
            if (arr[i]-p >=mid)
            {
                currk++;
                p=arr[i];
            }
        }
        return currk>=k;


    }
    public static int mxminima(int []arr, int n, int k)
    {
        int st=0,end=(int)1e9;
        int ans=-1;
        while (st<=end)
        {
            int mid=st+(end-st)/2;
            if (divpossible(arr,k,mid))
            {
                ans=mid;
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
        System.out.println("enter number of st points");
        int n=sc.nextInt();

        int [] arr= createarr(n,sc);
        System.out.println("enter no of  kids");
        int k=sc.nextInt();
        System.out.println("the maximum lowest distance is " + mxminima(arr,n,k));
    }
}
