package arraypractice;

import java.util.Scanner;

public class unique {
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
    public static int norepeat(int[]arr)
    {
        int u=-1;
        for (int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if (arr[i]==arr[j])
                {
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
            for (int k=0;k<arr.length;k++)
            {
                if (arr[k]!=-1)
                {
                  u=  arr[k];
                }
            }
        }
        return u;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no of elemnts");
        int n=sc.nextInt();
        int [] arr=createarr(n,sc);
        System.out.println("the number that doesnt repeat itself is "+ norepeat(arr));
    }
}
