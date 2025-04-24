package arrays;

import java.util.Scanner;

public class unique {

        public static int[] createarr(int n)
        {
            Scanner sc= new Scanner(System.in);
            int arr[]=new int[n];
            System.out.println("enter elements of array");
            for (int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            return arr;
        }
        public static int unique(int arr[]) {
            int u = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j])
                    {
                        arr[i]=-1;
                        arr[j]=-1;
                    }
                }
            }
            for (int k=0;k<arr.length;k++)
            {
                if (arr[k]!=-1)
                {
                    u=arr[k];

                }

            }

            return u;
        }

                public static void main (String[]args){
                    Scanner sc = new Scanner(System.in);
                    System.out.println("enter size");
                    int n = sc.nextInt();
                    int[] arr = createarr(n);
                    System.out.println(unique(arr));

                }
            }



