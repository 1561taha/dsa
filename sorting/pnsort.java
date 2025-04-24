package sorting;

import java.util.Scanner;

public class pnsort {
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
    public static void sortpn(int[] arr,int n)
    {


        int i=0,j=n-1;
        while (i<j)
        {
            while (arr[i]<0)i++;
            while (arr[j]>=0)j--;




        if (i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }}

    }
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int [] arr= createarr(n,sc);
       sortpn(arr,n);
       printarr(arr,0);

    }
}
