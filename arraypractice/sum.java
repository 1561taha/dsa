package arraypractice;

import java.util.Scanner;

public class sum {
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
    public static  void printarr(int n,int arr[])
    {
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static int calcsum(int arr[])
    { int s=0;
        for (int i=0;i<arr.length;i++)
        {
            s+=arr[i];
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=createarr(n,sc);
        printarr(n,arr);
        System.out.println(calcsum(arr));


    }
}
