package array2d;

import java.util.Scanner;

public class react1 {
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
    public static int rect(int arr[][], int l1, int r1,int l2,int r2)
    {
        int sum=0;
        for (int i=l1;i<=l2;i++)
        {
            for (int j=r1;j<=r2;j++)
            {
                sum+=arr[i][j];
            }
        }
        return sum;
    }
    public static void pre(int [][]arr,int r, int c)
    {
        for (int i=0;i<r;i++)
        {
            for (int j=1;j<c;j++)
            {
                arr[i][j]+=arr[i][j-1];
            }
        }

    }
    public static int ans(int[][]arr,int l1,int r1,int l2,int r2)
    { int sum =0;
        for (int i=l1;i<=l2;i++)
        {
            if (r1>=1) {
                sum += arr[i][r2] - arr[i][r1 - 1];
            }
            else {
                sum += arr[i][r2];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter dimensions of array");
        int r=sc.nextInt();
        int c= sc.nextInt();
        int[][] arr=craetearr(r,c,sc);
        printarr(arr,r,c);
        System.out.println("enter coord");
        int l1= sc.nextInt();
        int r1=sc.nextInt();
        int l2=sc.nextInt();
        int r2=sc.nextInt();
        System.out.println("sum of rect is "+rect(arr,l1,r1,l2,r2));
pre(arr,r,c);
        System.out.println("sum"+ ans(arr,l1,r1,l2,r2));


    }
}
