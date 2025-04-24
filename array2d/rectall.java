package array2d;

import java.util.Scanner;

public class rectall {
    public static int [][] creatarr(int r, int c, Scanner sc)
    { int [][] arr=new int[r][c];
        System.out.println("enter elemnts of arr");
        for (int i=0;i<r;i++)
        {
            for (int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        return arr;
    }
    public static void printarr(int [][]arr,int r, int c)
    {
        for (int i=0;i<r;i++)
        {
            for (int j=0;j<c;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int  rect(int [][]arr, int l1, int r1, int l2 , int r2)
    { int sum=0;
        for (int i=r1;i<=r2;i++)
        {
            for (int j=l1;j<=l2;j++)
            {
                sum+=arr[i][j];
            }
        }
        return sum;
    }
    public static void pre(int [][]arr,int r, int c)
    {
        for (int i=0;i<r;i++)
        {
            for (int j=1;j<c;j++)
            {
                arr[i][j]+=arr[i][j-1];
            }
        }
        printarr(arr,r,c);
    }
    public static int sum2(int [][]arr, int l1, int r1, int l2, int r2)
    {
        int sum=0;
        for (int i=l1;i<=l2;i++)
        {
            if (r1>=1) {
                sum += arr[i][r2]-arr[i][r1-1];
            }
            else {
                sum+=arr[i][r2];
            }
        }
        return sum;


    }
    public static void prec(int [][] arr,int r, int c)
    {
        for (int i=1;i<c;i++)
        {
            for (int j=0;j<r;j++)
            {
                arr[i][j]+=arr[i-1][j];
            }
        }
        printarr(arr,r,c);
    }
    public static int sum3(int [][]arr, int l1, int r1, int l2, int r2)
    {int sum=0, up=0,left=0,lup=0;
        up=arr[l1-1][r2];
        left=arr[l2][r1-1];
        lup=arr[l1-1][r1-1];
        sum=arr[l2][r2]-arr[l2][r1-1]-arr[l1-1][r2]+arr[l1-1][r1-1];

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter dimensions");
        int r=sc.nextInt();
        int c= sc.nextInt();
        int [][]arr=creatarr(r,c,sc);
        printarr(arr,r,c);
        System.out.println("enter dimensions of rectangle");
        int l1=sc.nextInt();
        int r1=sc.nextInt();
        int l2=sc.nextInt();
        int r2=sc.nextInt();
        int sum =rect(arr,l1,r1,l2,r2);
        System.out.println("sum"+sum);
        pre(arr,r,c);
        int sum_=sum2(arr,l1,r1,l2,r2);
        System.out.println("sum"+sum_);
        prec(arr,r,c);
        int sum__=sum3(arr,l1,r1,l2,r2);
        System.out.println("sum"+sum__);


    }
}
