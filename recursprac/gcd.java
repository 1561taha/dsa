package recursprac;

import java.util.Scanner;

public class gcd {
    public static  int ngcd(int n, int m)
    {
        while (n%m>0)
        {
            int rem=n%m;
            n=m;
            m=rem;
        }
        return m;
    }
    public static int egcd(int n, int m)
    {
        if (m==0)
        {
            return n;
        }
        return egcd(m,n%m);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println(ngcd(n,m));
        System.out.println(egcd(n,m));


    }
}
