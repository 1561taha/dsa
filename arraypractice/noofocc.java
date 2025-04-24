package arraypractice;

import java.util.Scanner;

public class noofocc {
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
    public static int occc(int []arr, int x)
    { int count=0;
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]==x)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no of elemnts");
        int n=sc.nextInt();
        int [] arr=createarr(n,sc);
        System.out.println("enter element to be searched");
        int x=sc.nextInt();

        System.out.println(x + " apppears " + occc(arr,x) + " times");



    }
}
