package array2dprac;

import java.util.Scanner;

public class transextra {
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
    public static int [][] answer(int [][]arr, int r, int c)
    {
        int [][] ans=new int[c][r];
        for (int i=0;i<c;i++)
        {

            for (int j=0;j<r;j++)
            {
                ans[i][j]=arr[j][i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter dimensions of array");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][] arr=createarr(r,c,sc);
        printarr(arr,r,c);

    }
}
