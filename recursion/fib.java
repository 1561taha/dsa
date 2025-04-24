package recursion;

import java.util.Scanner;

public class fib {
    public static int fibo(int n)
    {
        if (n==1 || n==2)
        {
            return 1;
        }
        int fibn=fibo(n-1)+fibo(n-2);
        return fibn;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System .in);
        System.out.println("enter number");
         int n=sc.nextInt();
         int fibn=fibo(n);
        System.out.println(fibn);
    }
}
