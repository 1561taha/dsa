package arraypractice;

import java.util.Scanner;

public class          krotate {
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
    public static int [] rev(int [] arr, int a, int b)
    {

        for (;a<b;a++,b--) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("enter number of elemnts");
        int n=sc.nextInt();
        int []arr=createarr(n,sc);
        System.out.println("enter k steps");
        int k=sc.nextInt();
        k=k%n;
        rev(arr,0,n-1);
        rev(arr,0,n-1-k);
        rev(arr,n-k,n-1);
        printarr(arr);




    }
}
