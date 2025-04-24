package recursion;

import java.util.Scanner;

public class sumaltn {
    public static int calcsum(int n)
    {
        if (n==1)
        {
            return n;
        }
        int sum=0;
        if (n%2==0)
        {
            sum=calcsum(n-1)-n;
        }
        else
        {
            sum=calcsum(n-1)+n;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enetr a number");
        int n=sc.nextInt();
        int sum=calcsum(n);
        System.out.println(sum);

    }
}
