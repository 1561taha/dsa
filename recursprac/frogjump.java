package recursprac;

import java.util.Scanner;

public class frogjump {
    public static int[] createarr(int arr[],int idx, Scanner sc)
    {

        if (idx==arr.length)
        {
            return arr;
        }

        arr[idx]=sc.nextInt();
        createarr(arr,idx+1,sc);

        return arr;

    }
   public static  int best(int[]arr,int idx)
   {
       if (idx==arr.length-1)
       {
           return 0;
       }
       int o1=Math.abs(arr[idx]-arr[idx+1])+best(arr,idx+1);
       if (idx==arr.length-2) {
           return o1;
       }
       int o2=Math.abs(arr[idx]-arr[idx+2])+best(arr,idx+2);

       return Math.min(o1,o2);
   }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("enter "+n+" elents");
        arr=createarr(arr,0,sc);
        System.out.println(best(arr,0));

    }
}
