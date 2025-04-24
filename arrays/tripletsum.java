package arrays;

import java.util.Scanner;

public class tripletsum {
    public static int[] createarr(int n)
    {
        Scanner sc= new Scanner(System.in);
        int arr[]=new int[n];
        System.out.println("enter elements of array");
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static int triplets(int arr[],int t)
    {
        int count=0;
        for (int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                for (int k=j+1;k<arr.length;k++)
                {
                    if (arr[i]+arr[j]+arr[k]==t)
                    {
                        count++;
                    }
                }
            }
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size ");
        int n =sc.nextInt();
        int []arr=createarr(n);
        System.out.println("enter target");
        int t=sc.nextInt();
        System.out.println(triplets(arr,t));

    }
}
