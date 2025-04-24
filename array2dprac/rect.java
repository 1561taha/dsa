package array2dprac;

import java.util.Scanner;

public class rect {
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
    public static void prefixsum(int arr[][], int n, int m)
    {
        for (int i=0;i<n;i++)
        {
            for (int j=1;j<m;j++)
            {
                arr[i][j]+=arr[i][j-1];
            }
        }
    }
    public static int sum(int [][]arr,int n, int m,int l1, int r1,int l2,int r2)
    {
        prefixsum(arr,n,m);
        int sum=0;
        for (int i=l1;i<=l2;i++)
        {
            if (r1>0) {
                sum += arr[i][r2] - arr[i][r1 - 1];
            }
            else
                sum+=arr[i][r2];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter dimensions of rect");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][] arr=craetearr(n,m,sc);
        printarr(arr,n,m);
        System.out.println("enter starting coordiantes");
        int l1=sc.nextInt();
        int r1=sc.nextInt();
        System.out.println("enter ending coordinates");
        int l2=sc.nextInt();
        int r2=sc.nextInt();

        int sum=sum(arr,n,m,l1,r1,l2,r2);
        System.out.println(sum);


    }
}
