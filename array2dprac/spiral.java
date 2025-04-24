package array2dprac;

import java.util.Scanner;

public class spiral {
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
    public static void printspiral(int[][] arr, int r, int c)
    {
        int r1=0;
        int r2=r-1;
        int c1=0;
        int c2=c-1;
        int t=r*c;
        int count=0;

        while (count<t)
        {
            for (int i=c1;i<=c2 && count<t;i++)
            {
                System.out.print(arr[r1][i] +" ");
                count++;
            }
            r1++;
            for (int i=r1;i<=r2 &&count<t ;i++) {
                System.out.print(arr[i][c2]+" ");
                count++;
            }
            c2--;
            for (int i=c2;i>=c1 && count<t;i--)
            {
                System.out.print(arr[r2][i]+ " ");
                count++;
            }
            r2--;
            for (int i=r2;i>=r1 && count<t;i--)
            {
                System.out.print(arr[i][c1]+" ");
                count++;
            }
            c1++;


        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter dimensions of array");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][] arr=createarr(r,c,sc);
        printspiral(arr,r,c);


    }
}
