package array2dprac;

import java.util.Scanner;

public class multiply {
    public static int[][] createarr(int n,int m, Scanner sc) {
        int[][] arr = new int[n][m];
        System.out.println("enter " + n * m + "elements");
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m ; j++) {
                arr[i][j] = sc.nextInt();
            }

        }
        return arr;
    }
    public static int [][] multi(int [][]arr, int [][]brr, int r1 , int c1,int r2, int c2)
    {
        int [][]crr=new int[r1][c2];
        if (c1!=r2)
        {
            System.out.println("multiplication not possible");
        }
        else
        {

            for (int i=0;i<r1;i++)
            {
                for (int j=0;j<c2;j++)
                {
                    for (int k=0;k<c1;k++)
                    {
                        crr[i][j]+=arr[i][k]*brr[k][j];
                    }
                }
            }

        }
        return  crr;
    }

    public static void printarr(int [][] crr, int r1, int c2)
    {
        for (int i=0;i<r1;i++)
        {
            for (int j=0;j<c2;j++)
            {
                System.out.print(crr[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter rows and columns of array1");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=createarr(n,m,sc);
        System.out.println("enter rows and columns of 2nd array");
        int n1=sc.nextInt();
        int m1=sc.nextInt();
        int [][] brr=createarr(n1,m1,sc);

        int [][] crr=multi(arr,brr,n,m,n1,m1);
        printarr(crr,n,m1);

    }
}
