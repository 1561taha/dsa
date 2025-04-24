package arrays;

import java.util.Scanner;

public class rotatearr {
    public static int[] createarr(int n)
    {
        Scanner sc= new Scanner(System.in);
        int arr[]=new int[n];
        System.out.println("enter elements of array");
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static int [] rev(int arr [], int i, int j) {
        for (int k = 0, l = arr.length - 1; k < l; k++, l--) {
            int temp = arr[k];
            arr[k] = arr[l];
            arr[l] = temp;
        }
        return arr;
    }
    public static void printarry(int [] arr)
    {
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);

        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size");
        int n=sc.nextInt();
        int [] arr=createarr(n);
        System.out.println("enter rotation");
        int k=sc.nextInt();
        k=k%n;
        rev(arr,0,n-k-1);
        rev(arr,n-k,n-1);
        rev(arr,0,n-1);
        printarry(arr);



    }
}
