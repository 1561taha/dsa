package arraypractice;

import java.util.Scanner;

public class lastocc {
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
    public static void last(int[] arr, int x)
    {
        int o=-1;
        for (int i=arr.length-1;i>=0;i--)
        {
            if (arr[i]==x)
            {
                o=i;
                System.out.println("found "+x+" last at "+o);
                break;

            }


        }
        if (o==-1)
        {
            System.out.println("not found");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no of elements");
        int n=sc.nextInt();
        int [] arr=createarr(n,sc);
        System.out.println("ener element to be serachd");
        int x=sc.nextInt();
        last(arr,x);
    }
}
