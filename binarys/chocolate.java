package binarys;

import java.util.Scanner;

public class chocolate {
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

   public static boolean divpos(int []arr, int sm, int mid)
   {
       int st=1;
       int chc=0;
       for (int i=0;i<arr.length;i++)
       {
           if (arr[i]> mid)return false;
           if (chc+arr[i]<=mid)
           {
               chc+=arr[i];
           }
           else {
               st++;
               chc=arr[i];
           }
       }
       return st<=sm;
   }
    public static int minmax(int[]arr, int n, int sm)
    {
        int st=1,end=(int)1e9;
        int ans=-1;
        while (st<=end)
        {
            int mid=st+(end-st)/2;
            if (divpos(arr,sm,mid))
            {
                ans=mid;
                end=mid-1;
            }
            else {
                st=mid+1;
            }
        }
        return  ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no of boxes ");
        int n=sc.nextInt();
        int [] arr= createarr(n,sc);
        System.out.println("enter no of students");
        int sm=sc.nextInt();
        System.out.println("the minmum mx is "+ minmax(arr,n,sm));

    }
}
