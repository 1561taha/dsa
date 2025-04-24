package arrays;

import java.util.Scanner;

public class secondlargest {
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
    public static int smaxfind(int arr[])
    {
        int max =arr[0];
        int smax=arr[0];
        for (int i=0;i<arr.length;i++)
        {
            if (max<arr[i])
            {
                smax=max;
                max=arr[i];
            }
            else if (arr[i]==max && smax<arr [i])
            {
                smax=arr[i];
            }
        }
        return smax;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size");
        int n=sc.nextInt();
        int []arr=createarr(n);
        System.out.println(smaxfind(arr));


    }
}
