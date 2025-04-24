package recursprac;

import java.util.Scanner;

public class sumarr {
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
        System.out.print(arr[idx]+ " ");
        print(arr,idx+1);
    }
    public static int sum(int arr[], int idx)
    {
        int s=0;
        if (idx==arr.length)
    {
        return s;
    }
        s=arr[idx]+sum(arr,idx+1);
        return s;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enter "+n+" elemnts");
        int [] arr= new int[n];
        arr=createarr(arr,0,sc);
        print(arr,0);
        System.out.println(sum(arr,0));



    }
}
