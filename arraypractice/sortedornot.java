package arraypractice;

import java.util.Scanner;

public class sortedornot {
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
    public static boolean sorted(int[]arr)
    {
        int check=-1;
        for (int i=1;i<arr.length;i++)
        {
            if (arr[i]<arr[i-1]){
                check++;
                break;
            }

        }
        if (check==-1)
        {
            return true;
        }
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=createarr(n,sc);

        if (sorted(arr))
        {
            System.out.println("given array is sorted");
        }
        else System.out.println("its not sorted");

    }
}
