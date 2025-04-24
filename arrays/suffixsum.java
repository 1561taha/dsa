package arrays;

import java.util.Scanner;

public class suffixsum {
    public static int [] createarr(int n, Scanner sc)
    {
        int [] arr= new int[n];
        System.out.println("enter array elemnts");
        for (int i=0;i< arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static int [] suffix(int []arr)
    {
        for (int i=arr.length-2;i>=0;i--)
        {
            arr[i]+=arr[i+1];

        }
        return arr;
    }
    public static void printarry(int [] arr)
    {
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter size");
        int n= sc.nextInt();
        int [] arr=createarr(n,sc);
        printarry(arr);
        suffix(arr);
        printarry(arr);



    }
}
