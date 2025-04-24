package recursion;

import java.util.Scanner;

public class lineartf {
    public static boolean search(int []arr,int target,int idx)
    {
        if (idx==arr.length)
        {
            return false;
        }
        if (arr[idx]==target) return true;

        return search(arr,target, idx+1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int []arr={1,3,6,2,7,4,9,5,1};
        System.out.println("enter target");
        int  x=sc.nextInt();
       if (search(arr,x,0))
       {
           System.out.println("yes");
       }
       else System.out.println("no");
    }
}
