package recursprac;

import java.util.Scanner;

public class nto1 {
    public static void printno(int n)
    {
        if (n==1)
        {
            System.out.print(1+ " ");
            return;
        }
        System.out.print(n+ " ");
        printno(n-1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int n= sc.nextInt();
        printno(n);

    }
}
