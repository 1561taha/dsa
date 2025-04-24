package array2dprac;

import java.util.Scanner;

public class rect2 {

    public static int[][] createarr(int n,int m,Scanner sc)
    { int [][] arr=new int[n][m];
        System.out.println("enter"+n*m+"elements");
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        return arr;
    }
    public static  void preadd(int [][]arr, int n, int m)
    {
        for (int i=0;i<n;i++)
        {
            for (int j=1;j<m;j++)
            {
                arr[i][j]+=arr[i][j-1];
            }
        }
    }
    public static void preaddc(int[][]arr, int n, int m)
    {
        for (int i=1;i<n;i++)
        {
            for (int j=0;j<m;j++)
            {
                arr[i][j]+=arr[i-1][j];
            }
        }
    }
    public static void printarr(int[][]arr,int n, int m)
    {
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static int cord(int [][]arr,int l1,int r1,int l2,int r2)
    {
        int sum=0, up=0,left=0,lup=0;
        if (l1>=1) {
            up = arr[l1 - 1][r2];
        }
        if (r1>=1) {
            left = arr[l2][r1 - 1];
        }
        if (l1>=1&& r1>=1) {
            lup = arr[l1 - 1][r1 - 1];
        }
        //sum=arr[l2][r2]-arr[l1-1][r2]-arr[l2][r1-1]+arr[l1-1][r1-1];
        sum=arr[l2][r2]-up-left+lup;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int m=sc.nextInt();
        int [][] arr=createarr(n,m,sc);
        printarr(arr,n,m);
        preadd(arr,n,m);
        printarr(arr,n,m);
        System.out.println();
        preaddc(arr,n,m);
        printarr(arr,n,m);
        System.out.println("enteer starting co ordiantes");
        int l1=sc.nextInt();
        int r1=sc.nextInt();
        System.out.println("enter end co ordinates");
        int l2=sc.nextInt();
        int r2=sc.nextInt();
        System.out.println(cord(arr,l1,r1,l2,r2));




    }
}
