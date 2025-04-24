package recursion;

import java.util.Scanner;

public class linearidx {
    public static int search(int[]arr,int target,int idx)
    {
        if (idx==arr.length)
        {
            return -1;
        }
        if(arr[idx]==target) {
            return idx;
        }
       return search(arr,target,idx+1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int []arr={1,3,4,6,7,9,2,5,6};
        System.out.println("enter target");
        int x=sc.nextInt();

        System.out.println("found "+ x +"at "+search(arr,x,0));

    }
}
