package recursion;

import java.util.Scanner;

public class arraybasic {
    public static void printarr(int []arr, int idx)
    {
        if (idx==arr.length)
        {
            return;
        }
        System.out.print(arr[idx]+" ");
        printarr(arr,idx+1);
    }
    public static int max(int []arr,int idx)
    {
        if (idx==arr.length-1)
        {
            return arr[idx];
        }

        return Math.max(arr[idx],max(arr,idx+1));
    }
    public static int sum(int []arr,int idx)
    {
        if (idx==arr.length)
        {
            return 0;
        }
        int sum=arr[idx]+sum(arr,idx+1);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int [] arr={2,4,1,5,8,6,7};
        printarr(arr,0);
        System.out.println();
      int m=  max(arr,0);
        System.out.println(m);
        System.out.println(sum(arr,0));


    }
}
