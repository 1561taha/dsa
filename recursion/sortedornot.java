package recursion;

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
    public static boolean check(int[] arr, int n, int idx) {
        if (idx == n - 1) {
            return true;
        }

        if (arr[idx] > arr[idx + 1]) {
            return false;
        }

        return check(arr, n, idx + 1);
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int []arr=createarr(n);
        System.out.println(check(arr,n,0));
    }
}
