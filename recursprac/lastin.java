package recursprac;

import java.util.Scanner;

public class lastin {
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
    public static int exist(int[]arr,int idx,int x)
    {
        if (idx<0)
        {
            return -1;
        }
        if (arr[idx]==x) {
            return idx;
        }
        return exist(arr,idx-1,x);


    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter sizeof array");
        int n=sc.nextInt();
        System.out.println("enter "+n+" elements");
        int [] arr= new int[n];
        arr=createarr(arr,0,sc);
        print(arr,0);
        System.out.println("enter x");
        int x=sc.nextInt();
        System.out.println(exist(arr,n-1,x));
    }
}
