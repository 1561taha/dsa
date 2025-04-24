package arrays;

import java.util.Scanner;

public class sort01 {
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
    public static void  swap(int arr[],int i, int j) {

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }


    public static int [] sortby01(int [] arr)
    {
        for (int i=0,j=arr.length-1;i<j;){
            if (arr[i]==0)
            {
                i++;
            }
            if (arr[j]==1)
            {
                j--;
            }
            if (arr[i]==1&& arr[j]==0)
            {
                swap(arr,i,j);
                i++;
                j--;

            }
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
        int [] arr= createarr(n);
        System.out.println("og array");
        printarry(arr);

        int [] sorted=sortby01(arr);
        System.out.println("after sorted");
        printarry(arr);

    }
}
