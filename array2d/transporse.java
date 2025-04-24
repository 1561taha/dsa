package array2d;

import java.util.Scanner;

public class transporse {
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
    public static void answer(int [][] arr,int n,int m)
    {
        int [] []brr= new int[m][n];
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                brr[i][j]=arr[j][i];
            }

        }
        printarr(brr,m,n);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter no of rows");
        int n=sc.nextInt();
        System.out.println("enter no of columns");
        int m=sc.nextInt();
        int [][] arr=craetearr(n,m,sc);
        printarr(arr,n,m);
        answer(arr,n,m);
    }
}
