package method;

import java.util.Scanner;

public class fib {
    public static void fibo(int n)
    {
        int a=1;
        int b=1;
        int sum =1;
        for (int i=0;i<=n-1;i++)
        {
            System.out.println(sum);
            sum=a+b;

            a=b;
            b=sum;
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        fibo(n);

    }
}
