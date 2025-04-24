package arraypractice;

import java.util.Scanner;

public class qpresent {
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

    public static int [] createfreq(int [] arr)
    {
        int [] freq=new int[100005];
        for (int i=0;i<arr.length;i++)
        {
            freq[arr[i]]++;
        }
        return freq;
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter no of elemnts");
        int n=sc.nextInt();
        int [] arr=createarr(n,sc);
        int [] freq=createfreq(arr);
        System.out.println("enter no of queries");
        int q=sc.nextInt();

        while (q>0)
        {
            System.out.println("enter element to be searched");
            int x=sc.nextInt();
            if (freq[x]>0)
            {
                System.out.println("yes present");
            }
            else {
                System.out.println("not present");
            }
            q--;

        }



    }
}
