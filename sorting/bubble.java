package sorting;

import java.util.Scanner;

public class bubble {
    public static  int[] createarr( int n,Scanner sc)
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
   public static void bsort(int []arr, int n)
   {
       for (int i=0;i<n-1;i++)
       { boolean flag=false;
           for (int j=0;j<n-i-1;j++)
           {

               if (arr[j]>arr[j+1])
               {
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                   flag=true;

               }
           }
           if (flag==false)
           {
               return;
           }
       }
   }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of arr");
        int n=sc.nextInt();
        int [] arr= createarr(n,sc);
        bsort(arr,n);
        printarr(arr,0);



    }
}
