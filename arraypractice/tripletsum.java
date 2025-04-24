package arraypractice;

import java.util.Arrays;
import java.util.Scanner;

public class tripletsum {
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
    public static int target(int []arr,int x)
    {
        int t=0;
        for (int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                for (int k=j+1;k<arr.length;k++)
                {
                    if (arr[i]+arr[j]+arr[k]==x)
                    {
                        t++;
                    }
                }
            }
        }

        return t;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number of elemnts");
        int n=sc.nextInt();
        int []arr=createarr(n,sc);

        System.out.println("enter target sum");
        int x=sc.nextInt();

        System.out.println("numbere of triplets whose sum is "+x+" are "+target(arr,x));


    }
}
