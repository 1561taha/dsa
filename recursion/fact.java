package recursion;

import java.util.Scanner;

public class fact {
    public static int factr(int n)
    {
        if (n==1)
        {
            return 1;
        }
        int facto=n*factr(n-1);
        return facto;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
       int fact= factr(n);
        System.out.println(fact);
    }
}
