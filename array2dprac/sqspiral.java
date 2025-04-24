package array2dprac;

import java.util.Scanner;

public class sqspiral {
    public static int [][] spiral(int n, int m)
    {
        int [][] arr=new int[n][m];

        int r1=0;
        int r2=n-1;
        int c1=0;
        int c2=m-1;
        int t=n*m;
        int c=1;
        while (c<=t)
        {
            for (int i=c1;i<=c2&&c<=t;i++)
            {

                arr[r1][i]=c;
                c++;
            }
            r1++;
            for (int i=r1;i<=r2 && c<=t;i++)
            {
                arr[i][c2]=c;
                c++;
            }
            c2--;
            for (int i=c2;i>=c1 && c<=t;i--)
            {
                arr[r2][i]=c;
                c++;
            }
            r2--;
            for (int i=r2;i>=r1 && c<=t;i--)
            {
                arr[i][c1]=c;
                c++;
            }
            c1++;
        }
       return arr;
    }
    public static void printarr(int [][]arr, int n, int m)
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
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int [][] arr=spiral(n,n);
        printarr(arr,n,n);

    }
}
