package recursion;

import java.util.Scanner;

public class basicnumber {
    public static void ascend(int n)
    {
        if (n==1)
        {
            System.out.println(1);
            return;
        }
        ascend(n-1);
        System.out.println(n);
    }
    public static void desc(int n)
    {
        if (n==1)
        {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        desc(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        System.out.println("ascending :");
        ascend(n);
        System.out.println("descend:");
        desc(n);
    }
}
