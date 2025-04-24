package sorting;

import java.util.Scanner;

public class count {
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
        if (idx==arr.length) {

            return;
        }
        System.out.print(arr[idx]+ " ");
        printarr(arr,idx+1);
    }
    public static int fmax(int[]arr,int n)
    {
        int max=Integer.MIN_VALUE;
        for (int i=0;i<n;i++)
        {
            if (arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
    public static void basiccount(int []arr,int n)
    {
        int max=fmax(arr,n);
        int []freq=new int[max+1];
        for (int i=0;i<n;i++)
        {
            freq[arr[i]]++;
        }

        int k=0;
        for (int i=0;i<freq.length;i++)
        {
            for (int j=0;j<freq[i];j++)
            arr[k++]=i;
        }

    }
    public static void csort(int []arr,int n)
    {
        int max=fmax(arr,n);

        int []freq=new int[max+1];
        for (int i=0;i<n;i++)
        {
            freq[arr[i]]++;
        }
        int []out=new int[n];
        for (int i=1;i<freq.length;i++)
        {
            freq[i]+=freq[i-1];
        }
        for (int i=n-1;i>=0;i--)
        {
            int idx =freq[arr[i]]-1;
            out[idx]=arr[i];
            freq[arr[i]]--;
        }
        for (int i=0;i<n;i++)
        {
            arr[i]=out[i];
        }
    }
//    public static void csort(int []arr, int n)
//    {
//        int max=fmax(arr,n);
//        int [] freq=new int[max+1];
//        for (int i=0;i<n;i++)
//        {
//            freq[arr[i]]++;
//        }
//        for (int i=1;i<freq.length;i++)
//        {
//            freq[i]+=freq[i-1];
//        }
//        int [] out=new int[n];
//        for (int i=n-1;i>=0;i--)
//        {
//            int idx=freq[arr[i]]-1;
//            out[idx]=arr[i];
//            freq[arr[i]]--;
//        }
//
//        for (int i=0;i<n;i++)
//        {
//            arr[i]=out[i];
//        }
//
//    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int[] arr= createarr(n,sc);
//        basiccount(arr,n);
        csort(arr,n);
        printarr(arr,0);



    }
}
