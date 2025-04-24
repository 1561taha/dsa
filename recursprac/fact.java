package recursprac;

import java.util.Scanner;

public class fact {
    public static int fact(int n)
    {if (n==0 || n==1)
    {
        return 1;
    }
      return n*  fact(n-1);
    }
    public static void main(String[] args) {
        System.out.println("enter a no");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fact(n));

    }
}
