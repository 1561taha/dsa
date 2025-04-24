package binarys;

import java.util.Scanner;

public class trgrotated {
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
    public static int trgidx(int []arr, int n, int x)
    {
        int st=0,end=n-1;
        int ans=-1;
        while (st<=end)
        {
            int mid=st+((end-st)/2);
            if (arr[mid]==x)
            {
                return mid;
            } else if (arr[st]==arr[mid]&& arr[mid]==arr[end]) {
            st++;
            end--;

            } else if (arr[mid]<=arr[end]) {
                if (x > arr[mid] && x <= arr[end]) {
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            else
                {if (x<arr[mid]&& x>=arr[st])
                  {
                      end=mid-1;
                  }
                  else {
                      st=mid-1;

                }
                }


        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of array");
        int n= sc.nextInt();
        int [] arr= createarr(n,sc);
        System.out.println("enter target");
        int x=sc.nextInt();
        System.out.println("target is present at "+ trgidx(arr,n,x));


    }
}
