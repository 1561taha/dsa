package recursion;

import java.util.Scanner;

public class linearall {
    public static  void search(int []arr,int target, int idx)
    {
        if (idx==arr.length)
        {
            return;
        }
        if(arr[idx]==target)
        {

            System.out.println(idx);

        }
        search(arr,target,idx+1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int []arr={2,3,1,4,2,5,2,5,2,1};
        System.out.println(" enter target");
        int x=sc.nextInt();
        search(arr,x,0);


    }
}
