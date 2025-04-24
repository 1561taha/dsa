package practice.pattern;

import java.util.Scanner;

public class starpyr {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int nsp=n-1;
        int nst=1;
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=nsp;j++)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=nst;k++)
            {int a=k+64;
                char ch;
                ch=(char)a;
                System.out.print(ch);
            }
            nsp--;
            nst+=2;
            System.out.println();
        }
    }
}
