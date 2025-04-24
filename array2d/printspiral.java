package array2d;

import java.util.Scanner;

public class printspiral {
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
    public static void spiralprint(int[][]arr, int n, int m)
    { int rowf=0,rowl=n-1,colf=0,coll=m-1;

        for (int total=0;total<=n*m;)
        {
            for (int i=colf;i<=coll&&total<n*m;i++ )
            {
                System.out.print(arr[rowf][i]+" ");
                total++;
            }
            rowf++;
            for (int i=rowf;i<=rowl&&total<n*m;i++)
            {
                System.out.print(arr[i][coll]+" ");
                total++;
            }
            coll--;
            for (int i =coll;i>=colf&&total<n*m;i--)
            {
                System.out.print(arr[rowl][i]+" ");
                total++;
            }
            rowl--;
            for (int i=rowl;i>=rowf&&total<n*m;i--)
            {
                System.out.print(arr[i][colf]+" ");
                total++;
            }
            colf++;
        }
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
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number of rows");

        int n= sc.nextInt();
        System.out.println("enter no of columns");
        int m=sc.nextInt();
        int [][]arr=craetearr(n,m,sc);
        printarr(arr,n,m);
        spiralprint(arr,n,m);


    }
}
