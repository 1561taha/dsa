package array2dprac;

import java.util.Scanner;

public class rotate {
    public static int[][] createarr(int n, int m, Scanner sc) {
        int[][] arr = new int[n][m];
        System.out.println("enter " + n * m + "elements");
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m ; j++) {
                arr[i][j] = sc.nextInt();
            }

        }
        return arr;
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
    public static void swap(int[][]arr,int i, int j)
    {
        int temp=arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]=temp;
    }
    public static  void trans(int[][]arr,int r , int c)
    {
        for (int i=0;i<r;i++)
        {
            for (int j=i;j<c;j++)
            {

                swap(arr,i,j);

            }
        }
    }

    public static void swa(int[]arr)
    {

        for (int i=0,j=arr.length-1;i<j;i++,j--)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    public static void rot(int[][] arr,int n)
    {
        for (int i=0;i<n;i++)
        {
            swa(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int [][]arr=createarr(n,n,sc);
        trans(arr,n,n);
        rot(arr,n);
        printarr(arr,n,n);


    }
}
