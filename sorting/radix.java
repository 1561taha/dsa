package sorting;

import java.util.Scanner;

public class radix {

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
        public static void csort(int []arr,int n, int place)
        {


            int []freq=new int[10];
            for (int i=0;i<n;i++)
            {
                freq[(arr[i]/place)%10]++;
            }
            int []out=new int[n];
            for (int i=1;i<freq.length;i++)
            {
                freq[i]+=freq[i-1];
            }
            for (int i=n-1;i>=0;i--)
            {
                int idx =freq[(arr[i]/place)%10]-1;
                out[idx]=arr[i];
                freq[(arr[i]/place)%10]--;
            }
            for (int i=0;i<n;i++)
            {
                arr[i]=out[i];
            }
        }
        public static void rsort(int []arr,int n)
        {
            int max= fmax(arr,n);
            for (int place=1;max/place>0;place*=10)
            {
                csort(arr,n,place);
            }
        }

        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("enter size of arr");
            int n= sc.nextInt();
            int [] arr= createarr(n,sc);
            rsort(arr,n);
            printarr(arr,0 );

        }
    }


