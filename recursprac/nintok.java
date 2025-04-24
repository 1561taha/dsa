package recursprac;

import java.util.Scanner;

public class nintok {
    public static void multiple(int n,int k)
    {
        if (k==1)
        {
            System.out.println(n);
            return;
        }
        multiple(n,k-1);
        System.out.println(n*k);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        System.out.println("enter k multiples");
        int k=sc.nextInt();
        multiple(n,k);
    }
}
