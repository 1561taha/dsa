package arrays;

import java.util.Scanner;

public class sortedornot {
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
public static boolean arrcheck(int arr[])
{
    boolean check=true;
    for (int i=1;i<arr.length;i++)
    {
        if (arr[i]<arr[i-1])
        {
            check =false;
        }
    }
    return check;
}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of array ");
        int n=sc.nextInt();
        int arr[]=createarr(n);
        System.out.println(arrcheck(arr));

    }
}
