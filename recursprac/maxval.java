package recursprac;

import java.util.Scanner;

public class maxval {
    public static int[] createarr(int []arr,int idx, Scanner sc)
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
        System.out.println(arr[idx]);
        print(arr,idx+1);
    }
    public static int max(int[]arr,int idx) {

        if (idx == arr.length - 1) {
            return arr[idx];
        }
         return Math.max(arr[idx],max(arr,idx+1));
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        System.out.println("enter "+n +" elemnt");
        int [] arr=new int[n];
        arr=createarr(arr,0,sc);
        print(arr,0);
        System.out.println("max="+max(arr,0));

    }
}
