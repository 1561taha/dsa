package recursion;

import java.util.Scanner;

public class gcdlcm {
    public static  int gcd(int x, int y)
    {
        if (y==0)
        {
            return x;
        }
        return gcd(y,x%y);
    }
    public static int lcm(int x, int y)
    {
        if (y==0)
        {
            return x;
        }
        return x*y/gcd(x,y);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter 1st no");
        int x=sc.nextInt();
        System.out.println("enter 2nd no");
        int y=sc.nextInt();
        System.out.println(gcd(x,y));
        System.out.println(lcm(x,y));

    }
}
