package practice.pattern;

import java.util.Scanner;

public class pyrmast {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int nsp=n-1;
       int  nst=1;
        for (int i=1;i<=n;i++)
        {

            for (int j=1;j<=nsp;j++)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=nst;k++)
            {
                System.out.print(k);
            }
            for (int l=i-1;l>=1;l--)
            {
                System.out.print(l);
            }
            nst++;
            nsp--;
            System.out.println();
        }
    }
}
