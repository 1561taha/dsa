package arraypractice;

import java.util.Scanner;

public class searchx {
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
    public static  void search (int []arr,int x)
    {
        int s=-1;
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]==x) {
                s=x;
                System.out.println("found " + x + "at" + i);
                break;
            }



        }
        if (s==-1)
        {
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
        System.out.println("enter no of elements");
     int n=sc.nextInt();
     int []arr=createarr(n,sc);
        System.out.println("enter element to be searched");
        int x=sc.nextInt();
        search(arr,x);


    }
}
