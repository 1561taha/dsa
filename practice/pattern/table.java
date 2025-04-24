package practice.pattern;

import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int str=n-1;
        int nsp=1;

        for (int i=1;i<=n*2-1;i++)
        {
            System.out.print(i);
        }
        System.out.println();
        for (int i=1;i<=n-1;i++)
        {
            int a=1;
            int d=a+64;
            char ch;
            ch=(char)d;
            for (int j=1;j<=str;j++)
            {
                System.out.print(ch);
                ch++;

            }

            for (int j=1;j<=nsp;j++)
            {
                System.out.print(" ");
                ch++;
            }

            for (int j=1;j<=str;j++)
            {
                System.out.print(ch);
                ch++;
            }

            str--;
            nsp+=2;
            System.out.println();

        }
    }
}
