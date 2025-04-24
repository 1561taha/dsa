package sorting;

import java.util.Scanner;

public class merge {
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
//    public static void fmerge(int[]arr, int l, int r, int mid)
//    {
//        int n1=mid-l+1;
//        int n2=r-mid;
//        int [] left=new int[n1];
//        int [] right=new int[n2];
//        int i,j,k;
//        for (i=0;i<n1;i++)left[i]=arr[l+i];
//        for (j=0;j<n2;j++)right[j]=arr[mid+1+j];
//        i=0;
//        j=0;
//        k=l;
//        while (i<n1 && j
//
//                 <n2)
//        {
//            if (left[i]<right[j])
//            {
//                arr[k++]=left[i++];
//            }
//            else arr[k++]=right[j++];
//
//        }
//        while (i<n1)
//        {
//            arr[k++]=left[i++];
//        }
//        while (j<n2)
//        {
//            arr[k++]=right[j++];
//
//        }
//    }
//    public static  void msort(int []arr, int l, int r)
//    {
//        if (l>=r)
//        {return;}
//        int mid=(l+r)/2;
//        msort(arr,l,mid);
//        msort(arr,mid+1,r);
//        fmerge(arr,l,r,mid);
//    }
    public static void mergefn(int []arr,int st, int end , int mid)
    {
        int n1=mid-st+1;
        int n2=end-mid;

        int [] left=new  int[n1];
        int [] right=new int[n2];

        for (int i=0;i<n1;i++)
        {
            left[i]=arr[st+i];

        }
        for (int i=0;i<n2;i++)
        {
            right[i]=arr[mid+1+i];
        }
        int i=0,j=0,k=st;
        while (i<n1 &&j <n2)
        {
            if (left[i]<right[j])
            {
                arr[k++]=left[i++];
            } else {
                arr[k++]=right[j++];
            }

            }
        while (i<n1)
        {
            arr[k++]=left[i++];
        }
        while(j<n2)
        {
            arr[k++]=right[j++];
        }
        }

    public static void msort(int[]arr,int st, int end)
    {
        if (st>=end) return;
        int mid=(st+end)/2;

        msort(arr,st,mid);
        msort(arr,mid+1,end);
        mergefn(arr,st,end,mid);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of array");
        int n= sc.nextInt();
        int [] arr=createarr(n,sc);
        msort(arr,0,n-1);
        printarr(arr,0);

    }
}
