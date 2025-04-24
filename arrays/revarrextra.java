package arrays;

import java.util.Scanner;

public class revarrextra {
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

    public static int[] copyarr(int arr[]) {
        int[] brr = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            brr[j] = arr[i];
        }
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }
        return brr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entr size");
        int n=sc.nextInt();
        int [] arr=createarr(n);
        int [] brr= copyarr(arr);


    }
}
