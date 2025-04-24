package array2d;

import java.util.Scanner;

public class rotate {
    public static int [] [] craetearr(int n, int m, Scanner sc)
    {int [][] arr=new int[n][m];
        System.out.println("enter"+ n*m +"elements");
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        return arr;
    }
    public static void printarr(int arr[][],int n, int m)
    {
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void answer(int [][]arr, int n,int m)
    {
        for (int i=0;i<n;i++)
        {
            for (int j=i;j<n;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;

            }
        }
        System.out.println("transporse");
        printarr(arr, n,n);
    }
    public static void swap(int []arr)
    {
        for (int i=0,j=arr.length-1;i<j;i++, j--)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    public static  void rotatearr(int [][] arr,int n)
    {
        answer(arr,n,n);
        for (int i=0;i<n;i++)
        {
            swap(arr[i]);

        }
        printarr(arr,n,n);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter dimensions of array");
        int n= sc.nextInt();
       int [][] arr= craetearr(n,n,sc);
        printarr(arr,n,n);
        rotatearr(arr,n);
    }
}
