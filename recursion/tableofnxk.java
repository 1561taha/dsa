package recursion;

import java.util.Scanner;

public class tableofnxk {
    public static void multiple(int n, int k)
    {
        if (k==0)
        {
            return;
        }

        multiple(n,k-1);
        System.out.println(n*k);

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        System.out.println("enter multiples");
        int k=sc.nextInt();
        multiple(n,k);


    }
}
