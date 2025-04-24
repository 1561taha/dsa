package arraypractice;

import java.util.Scanner;

public class sortevenodd {
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

    public static void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int []sort(int arr[])
    {
        for (int a=0,b=arr.length-1;a<b;)
        {
            if (arr[a]%2==0)
            {
                a++;
            }

            if (arr[b]%2!=0)
            {
                b--;
            }
            if (arr[a]%2!=0 && arr[b]%2==0)
            {
                swap(arr,a,b);
                a++;
                b--;
            }
        }
        return arr;
    }

    public static void printarr(int [] arr)
    {
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no of elemnts");
        int n= sc.nextInt();
        int [] arr= createarr(n,sc);
        sort(arr);
        printarr(arr);

    }
}
