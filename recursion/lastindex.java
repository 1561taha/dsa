package recursion;

import java.util.Scanner;

public class lastindex {
    public static  int  last(int []arr , int x, int idx)
    {
        if (idx<0)
        {
            return -1;
        }
        if (arr[idx]==x) {
            return idx;
        }
        return last(arr,x,idx-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr={1,2,3,2,1,4,3,2,1,3,4,5,2,1,3,4};
        int x=sc.nextInt();
        System.out.println(last(arr,x,arr.length-1));
    }

}
