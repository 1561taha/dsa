package sorting;

import java.util.Scanner;

public class quick {
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
    public static void swap(int []arr, int x , int y)
    {
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
//    public static int  part(int[] arr,int st ,int end)
//    {
//     int pt=arr[st];
//     int cnt=0;
//     for (int  i=st+1;i<=end;i++)
//     {
//         if (arr[i]<=pt) cnt++;
//     }
//     int pi=st+cnt;
//     swap(arr,st,pi);
//     int i=st,j=end;
//     while (i<pi && j>pi )
//     {
//         while (arr[i]<=pt) i++;
//         while (arr[j]>pt) j--;
//         if (i<pi && j>pi)
//         {
//             swap(arr, i, j);
//             i++;
//             j--;
//         }
//     }
//     return pi;
//    }

    public static int part(int []arr,int st, int end)
    {
        int pt=arr[st];

        int cnt=0;
        for (int i=st+1;i<end;i++)
        {
           if (arr[i]<=pt)cnt++;
        }
       int  pi=st+cnt;
        swap(arr,st,pi);
        int i=st,j=end;
        while (i<pi &&j>pi)
        {
            while (arr[i]<=pt)i++;
            while (arr[j]>pt)j--;

            if (i<pi && j>pi)
            {
                swap(arr,i,j);
                i++;
                j--;
            }
        }

     return pi;
    }
   public static void qsort(int [] arr,int st, int end)
   {
       if (st>=end)return ;
           int pi=part(arr,st,end);
           qsort(arr,st,pi-1);
           qsort(arr,pi+1,end);
   }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of array");
        int n= sc.nextInt();
        int [] arr= createarr(n,sc);
        qsort(arr,0,arr.length-1);
        printarr(arr,0);


    }
}
