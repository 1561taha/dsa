package sorting;

import java.util.Scanner;

public class sort012 {
    public static  int[] createarr(int n, Scanner sc)
    {
        int [] arr= new int[n];
        System.out.println("enter "+n+" elemnts");

        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        return arr;

    }
    public static void printarr(int[]arr, int idx)
    {
        if (idx==arr.length)
        {

            return;
        }
        System.out.print(arr[idx]+ " ");
        printarr(arr,idx+1);
    }
    public static void swap(int [] arr, int x , int y)
    {
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    public static  void sort(int [] arr, int n)
    {
        int l=0, mid=0, hi=n-1;
        while (mid<=hi)
        {
            if (arr[mid]==0)
            {
                swap(arr,l,mid);
                l++;
                mid++;
            }
           else if (arr[mid]==1)
            {
                mid++;
            }
            else
            {
                swap(arr,mid,hi);
                hi--;

            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int [] arr=createarr(n,sc);
        sort(arr,n);
        printarr(arr,0);
    }
}
