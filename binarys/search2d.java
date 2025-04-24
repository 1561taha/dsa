package binarys;

import java.util.Scanner;

public class search2d {
    public static int[][] create2d(int n, int m, Scanner sc)
    {
        int [][]arr=new int[n][m];
        System.out.println("enter "+n*m+" elements");
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        return arr;
    }
    public static boolean search(int [][]arr, int x)
    {
        int n=arr.length,m=arr[0].length;
        int st=0, end=n*m -1;
        while (st<=end)
        {
            int mid=st+(end-st)/2;
            int mid2=arr[mid/m][mid%m];

            if (mid2==x) return true;
            if (mid2<x)
            {
                st=mid+1;
            }
            else {
                end=mid-1;
            }

        }
        return false;
    }
public static boolean  search2(int[][]arr, int x)
{
    int n=arr.length, m=arr[0].length;

    int left=m-1,down=0;
    while(left>=0 && down<n)
    {

        if (arr[left][down]==x)return true;

        if (x<arr[left][down])
        {
            left--;
        }
        else {
            down++;
        }
    }
    return false;
}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of row");
        int n=sc.nextInt();
        System.out.println("enter size of column");
        int m=sc.nextInt();
        int [][] arr=create2d(n,m,sc);
        System.out.println("enter target");
        int x=sc.nextInt();
        System.out.println("doestarget exist in array: "+ search(arr,x));
        System.out.println("doestarget exist in array: "+ search2(arr,x));


    }
}
