package method;

import java.util.Scanner;

public class gcd {
    public static int gcd (int a,int b)
    {
        int big;
        {
            if (a<b)
            {
                big=a;
            }
            else {
                big = b;
            }
        }
        int g=0;
        for (int i=1;i<=big;i++)
        {
            if (a%i==0 && b%i==0)
            {
                g=i;
            }
        }
        return g;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        int g=gcd(a,b);
        System.out.println(g);

    }
}
