package arraypractice;

import java.util.Scanner;

public class sumpair {
    public static int [] createarr(int n , Scanner sc)
    {
        int arr[]=new int[n];
        System.out.println("enter elements of array");
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        return arr;
    }

    public static int target(int[]arr,int x)
    {
        int t=0;
        for (int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if (arr[i]+arr[j]==x)
                {
                    t++;
                }
            }
        }
        return t;
    }
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter number of elements");
        int n=sc.nextInt();
        int [] arr=createarr(n,sc);

        System.out.println("enter target");
        int x=sc.nextInt();

        System.out.println("number of pairs whose sum is "+x+" are "+target(arr,x));


    }
}
