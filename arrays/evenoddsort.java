package arrays;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class evenoddsort {
PriorityQueue<Integer>max= new PriorityQueue<>(Collections.reverseOrder());
    public static int [] createarray(int n, Scanner sc)
    {
        int [] arr= new int[n];
        System.out.println("enter elements ");
        for (int i=0;i < arr.length;i++ )
        {
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static void swap(int arr[],int i , int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int [] sortevenodd(int []arr)
    {
        for (int i=0,j=arr.length-1;i<j;)
        {
            if (arr[i]%2==0)
            {
                i++;
            }
            if (arr[j]%2!=0)
            {
                j--;
            }
            if (arr[i]%2!=0 && arr[j]%2==0)
            {
                swap(arr,i, j);
                i++;
                j--;
            }
        }
        return arr;
    }
    public static void printarr(int arr[])
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
        int [] arr=createarray(n,sc);
        System.out.println("og array");
        printarr(arr);
        int [] sorted= sortevenodd(arr);
        System.out.println("after sorting");
        printarr(arr);

    }
}
