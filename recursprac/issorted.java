package recursprac;

import java.util.Scanner;

public class issorted {
    public static int[] createarr(int arr[],int idx, Scanner sc)
    {

        if (idx==arr.length)
        {
            return arr;
        }

        arr[idx]=sc.nextInt();
        createarr(arr,idx+1,sc);

        return arr;

    }
    public static void print(int[] arr,int idx)
    {
        if (idx==arr.length)
        {
            return;
        }
        System.out.print(arr[idx]+ " ");
        print(arr,idx+1);
    }
    public static boolean sorted(int[]arr,int idx)
    {
        if (idx==arr.length-1)
        {
            return true;

        }
        if (arr[idx]>arr[idx+1])
        {
            return false;
        }
        return sorted(arr,idx+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        System.out.println("enter "+n+" elemrnts");
        int [] arr=new int[n];
               arr= createarr(arr,0,sc);
        print(arr,0);
        System.out.println(sorted(arr,0));


    }
}
