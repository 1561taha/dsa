package arrays;

import java.util.Scanner;

public class partionarr {
    public static int [] createarr(int n, Scanner sc)
    {
        int [] arr= new int[n];
        System.out.println("enter array elemnts");
        for (int i=0;i< arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        return arr;
    }
   public static  boolean equal(int []arr ,int total, int n)
   {int pref=0;
       int suf =0;
       for (int i=0;i<n;i++)
       {
           pref+=arr[i];
           suf=total-pref;
           if (pref==suf)
           {
               return true;
           }
       }
       return false;
   }
    public static int arraysum(int [] arr, int n)
    {
        int total=0;
        for (int i=0;i<n;i++)
        {
           total+=arr[i];
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size");
        int n=sc.nextInt();

        int [] arr=createarr(n,sc);
        int total=arraysum(arr,n);
        System.out.println("is partition possible ?"+ equal(arr,total,n));


        }



    }

