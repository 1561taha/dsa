package practice.pattern;

import java.util.Scanner;

public class trimast {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int str=1;
        int nsp=n-1;
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=nsp;j++)
            {

                System.out.print(" ");

            }
            for (int j=1;j<=str;j++)
            {int d=j+64;
                char ch;
                ch=(char)d;

                System.out.print(ch);

            }
            str++;
            nsp--;
            System.out.println();
        }
    }
}
