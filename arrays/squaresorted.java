package arrays;

import java.util.Scanner;

public class squaresorted {
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
    public static void printarr(int [] arr)
    {
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int [] rev(int [] arr)
    {

        for (int a=0,b=arr.length-1;a<b;a++,b--) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
        return arr;
    }
    public static  int [] sort (int [] arr)
    {
        int k=0;

        int [] ans=new int[arr.length];


        for (int i=0,j=arr.length-1;i<=j;)
        {

            if (Math.abs(arr[i])>Math.abs(arr[j]))
            {
                ans[k++]=arr[i]*arr[i];
                i++;

            }
            else {
                ans[k++]=arr[j]*arr[j];
                j--;
            }
        }

        rev(ans);

        return ans;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number of elemnts");
        int n=sc.nextInt();
        int [] arr=createarr(n,sc);
        int []ans= sort(arr);
        printarr(ans);

    }
}
