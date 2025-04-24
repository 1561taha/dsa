package sorting;

import java.util.Scanner;

public class insertion {
    public static  int[] createarr(int n, Scanner sc)
    {
        int [] arr= new int[n];
        System.out.println("enter "+n+" elemnts");

        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        return arr;

    }
    public static void printarr(int[]arr, int idx)
    {
        if (idx==arr.length)
        {

            return;
        }
        System.out.print(arr[idx]+ " ");
        printarr(arr,idx+1);
    }
    public static void insort(int[]arr, int n)
    {
        for (int i=1;i<n;i++)
        {
            int j=i;
            while (j>0&&arr[j]<arr[j-1])
            {
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;

            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int [] arr= createarr(n,sc);
        insort(arr,n);
        printarr(arr,0);


    }
}
