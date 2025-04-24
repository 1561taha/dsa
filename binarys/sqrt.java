package binarys;

import java.util.Scanner;

public class sqrt {
    public static int findrt(int x)
    {
        int st=0,end=x;
        int ans=-1;
        while (st<=end)
        {
           int  mid=st+((end-st)/2);
            int val=mid*mid;
            if (val==x)
            {
                return mid;
            } else if (val>x) {
                end=mid-1;

            }
            else {
                st=mid+1;
                ans=mid;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enetr target");
        int x= sc.nextInt();
        System.out.println("square root of "+ x + " is "+ findrt(x));

    }
}
