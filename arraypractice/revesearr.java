package arraypractice;

import java.util.Scanner;

public class revesearr {

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

    public static void printarr(int [] arr)
    {
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }
    public static void swap(int a, int b)
    {
        int temp;
        temp=a;
        a=b;
        b=temp;
    }
   public static int[] rev(int []arr, int n)
   {
       for (int a=0,b=n-1;a<b;a++,b--)
       {
           int temp=arr[a];
           arr[a]=arr[b];
           arr[b]=temp;

       }
       return arr;
   }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=createarr(n,sc);
        rev(arr,n);
        printarr(arr);

    }

}
