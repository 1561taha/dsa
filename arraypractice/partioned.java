package arraypractice;

import java.util.Scanner;

public class partioned {
    public static int [] createarr(int n , Scanner sc)
{
    int arr[]=new int[n];
    System.out.println("enter elements of array");
    for (int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    return arr;
}

    public static void printarr(int [] arr)
    {
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static int sumtotal(int [] arr)
    {
       int sumt=0;
       for (int i=0;i<arr.length;i++)
       {
           sumt+=arr[i];
       }
       return sumt;
    }
    public static boolean part(int [] arr)
    {
        int sumt=sumtotal(arr);
        int presum=0;
        int suf=0;
        for (int i=0;i<arr.length;i++)
        {

            presum+=arr[i];

            suf=sumt-presum;
            if (presum==suf)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        System.out.println("enter no of elemnts");
    int n=sc.nextInt();
    int [] arr=createarr(n,sc);
        System.out.println("partitioned possible:"+part(arr));

    }
}
