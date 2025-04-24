package sorting;

import java.util.Scanner;

public class selection {
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
   public static void sesort(int []arr, int n)
   {
       for (int i=0;i<n-1;i++)
       {
           int mini=i;
           for (int j=i+1;j<n;j++)
           {
               if (arr[mini]>arr[j])
               { mini=j;}

           }

           int temp=arr[i];
           arr[i]=arr[mini];
           arr[mini]=temp;

       }
   }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int[] arr= createarr(n,sc);
        sesort(arr,n);
        printarr(arr,0);


    }
}
