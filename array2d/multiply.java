package array2d;

import java.util.Scanner;

public class multiply {
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
    public static void mutiplying(int [][]arr,int [][] brr,int n,int m, int o, int p)
    {if (m!=o)
    {
        System.out.println("multiply not possible");
        return;
    }
        int [][] crr=new int[n][p];
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<p;j++)
            {
                for (int k=0;k<m;k++)
                {
                    crr[i][j]+=arr[i][k]*brr[k][j];
                }
            }
        }
        printarr(crr,n,p);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no of rows of 1st arr");
        int n=sc.nextInt();
        System.out.println("enter no of columns of 1st arr");
        int m=sc.nextInt();
        int [][] arr=craetearr(n,m,sc);
        System.out.println("enter no of rows of 2nd arr");
        int o=sc.nextInt();
        System.out.println("enter no of columns of 2nd arr");
        int p=sc.nextInt();
        int [][]brr =craetearr(o,p,sc);

        printarr(arr,n,m);
        printarr(brr,o,p);
        System.out.println("after mutiply");
        mutiplying(arr,brr,n,m,o,p);
    }
}
