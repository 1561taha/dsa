package arrays;

import java.util.Scanner;

public class queriescheck {
    public static int[] createarr(int n) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[n];
        System.out.println("enter elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int[] freqarr(int[] arr) {
        int freq[] = new int[100002];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        return freq;
    }
    public static void printarry(int [] arr)
    {
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);

        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n = sc.nextInt();
        int[] arr = createarr(n);
        System.out.println("enter number of queries ");
        int q = sc.nextInt();
        int[] freq = freqarr(arr);

        for (int i = 0; i < q; i++) {
            System.out.println("enter number");
            int k = sc.nextInt();
            if (freq[k] > 0) {
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }
    }
}