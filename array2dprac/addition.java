package array2dprac;

import java.util.Scanner;

public class addition {
    public static int [][] createarr(int n,int m,Scanner sc)
    {
        int [][]arr=new int[n][m];
        System.out.println("enter "+ n*m  +"elements");
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        return arr;
    }
    public static void printarr(int [][]arr,int n, int m)
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
    public static void add(int[][]arr,int [][]brr,int n,int m, int x , int y)
    {
        if (n!=x || m!=y)
        {
            System.out.println("addition not possible");
            return ;
        }
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<m;j++)
            {
                arr[i][j]+=brr[i][j];
            }
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no of elemnts");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][]arr=createarr(n,m,sc);
        System.out.println("enter no of elemnts of second array");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int [][]brr=createarr(x,y,sc);
add(arr,brr,n,m,x,y);
        printarr(arr,n,m);
    }
}
