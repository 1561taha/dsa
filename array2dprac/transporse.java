package array2dprac;

import java.util.Scanner;

public class transporse {
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
        System.out.println("enter dimensions of array");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][] arr=createarr(r,c,sc);
        printarr(arr,r,c);
        trans(arr,r,c);
        printarr(arr,r,c);

    }
}
