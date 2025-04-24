package recursprac;

import java.util.Scanner;

public class nthfibo {
    public static int fibon(int n)
    {
        if (n==0)
        {
            return 0;
        } else if (n==1|| n==2) {
            return 1;

        }
        return fibon(n-1)+fibon(n-2);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a no");
        int n=sc.nextInt();
        System.out.println(fibon(n));
    }
}
