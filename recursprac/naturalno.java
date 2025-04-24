package recursprac;

import java.util.Scanner;

public class naturalno {
    public static void printno(int n)
    {
        if (n==1)
        {
            System.out.print(1 +" ");
            return;
        }
        printno(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int n= sc.nextInt();
        printno(n);

    }
}
