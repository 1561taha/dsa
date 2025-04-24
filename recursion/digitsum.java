package recursion;

import java.util.Scanner;

public class digitsum {
    public static int adddig(int n)
    {
        if (n==0)
        {
            return n;
        }

        int sum=0;
        sum+=n%10+adddig(n/10);

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
       int sum= adddig(n);
        System.out.println(sum);
    }
}
