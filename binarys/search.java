package binarys;

import java.util.Scanner;

public class search {
    public static int[] createarr(int n, Scanner sc)
    {
        int [] arr= new int[n];
        System.out.println("enter "+ n+ " elements ");
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        return arr;
    }
    public static boolean ibsearch(int[] arr, int n, int tg)
    {
        int st=0, end=n-1, mid=st+(end-st)/2;
        while (st<=end)
        {
            if (arr[mid]==tg)
            {
                return true;
            } else if (arr[mid]>tg) {
                end=mid-1;

            }
            else {
                st=mid+1;
            }
        }

        return false;
    }
    public static boolean rbsearch(int [] arr, int st ,int end ,int tg)
    {
        int mid=st+((end-st)/2);
        if (st>end) return false;
        if (arr[mid]==tg)
        {
            return true;
        } else if (arr[mid]>tg) {
           return  rbsearch(arr,st,mid-1,tg);


        }
        else {
            return rbsearch(arr,mid+1,end,tg);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of array");
        int n= sc.nextInt();
        int [] arr= createarr(n,sc);
        System.out.println("enter target");
        int tg=sc.nextInt();
        System.out.println("does "+ tg+ " exist in array :"+ ibsearch(arr,n,tg));
        System.out.println("does "+ tg+ " exist in array :"+ rbsearch(arr,0,n-1,tg));

    }
    }
