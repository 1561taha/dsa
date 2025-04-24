package array2d;

import java.util.Scanner;

public class pascal {
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
    public static int[][] pass( int n)
    {
        int [][] arr=new int[n][n];
        for (int i=0;i<n;i++)
        {
           for (int j=0;j<i+1;j++)
           {
               if (i==j|| j==0)
               {
                   arr[i][j]=1;

               }
               else
               {
                   arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
               }
           }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();

    int [][]arr=    pass(n);
    printarr(arr,n,n);

    }
}
