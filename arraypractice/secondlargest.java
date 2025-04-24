package arraypractice;

import java.util.Scanner;

public class secondlargest {
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

    public static int large2(int arr[])
    {
        int l=Integer.MIN_VALUE;
        int l2=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]>l)
            {
                l2=l;
                l=arr[i];
            }
            else if (arr[i]>l2 && arr[i]!=l)
            {
                l2=arr[i];
            }
        }
        return l2;
    }
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();
        int arr[]= createarr(n,sc);
        System.out.println("second largest elemnet is "+large2(arr));


    }

}
