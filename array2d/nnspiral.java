package array2d;

import java.util.Scanner;

public class nnspiral {
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
    public static void spiral(int n,Scanner sc)
    {
        int [][] arr=new int[n][n];
        int rowf=0,rowl=n-1,colf=0,coll=n-1;
        int curr=1;
        while(curr<=n*n)
        {
            for(int i=colf;i<=coll&&curr<=n*n;i++)
            {
                arr[rowf][i]=curr++;
            }
            rowf++;
            for (int i=rowf;i<=rowl&&curr<=n*n;i++)
            {
                arr[i][coll]=curr++;
            }
            coll--;
            for (int i=coll;i>=colf&&curr<=n*n;i--)
            {
                arr[rowl][i]=curr++;

            }
            rowl--;
            for (int i=rowl;i>=rowf&&curr<=n*n;i--)
            {
                arr[i][colf]=curr++;
            }
            colf++;
        }
        printarr(arr,n,n);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter dimension");
        int n= sc.nextInt();
        spiral(n,sc);

    }
}
