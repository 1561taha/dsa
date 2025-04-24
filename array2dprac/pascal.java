package array2dprac;

import java.util.Scanner;

public class pascal {public static int[][] createarr(int n, int m, Scanner sc) {
    int[][] arr = new int[n][m];
    System.out.println("enter " + n * m + "elements");
    for (int i = 0; i < n ; i++) {
        for (int j = 0; j < m ; j++) {
            arr[i][j] = sc.nextInt();
        }

    }
    return arr;
}
    public static void printarr(int [][] crr, int n)
    {
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<=i;j++)
            {

                System.out.print(crr[i][j]+" ");
            }
            System.out.println();
        }

    }
public static int[][] pas(int n)
{
    int[][] ans=new int [n][];
    for (int i=0;i<n;i++)
    {
        ans[i]=new int[i+1];

        for (int j=0;j<i+1;j++)
        {
            if (i==j || j==0)
            {
                ans[i][j]=1;
            }
            else
            {
                ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
            }
        }
    }


return ans;

}
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int [][] ans=pas(n);
    printarr(ans,n);


    }
}
