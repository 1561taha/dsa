package arrays;

import java.util.Scanner;

public class strictlygreat {
    public static int count(int arr[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter x");
        int x=sc.nextInt();
        int occ=0;
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]>x)
            {
                occ++;
            }

        }
        return occ;
    }
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
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of array ");
        int n=sc.nextInt();
        int arr[]=createarr(n);
        int occ=count(arr);
        System.out.println(occ);


    }
}
