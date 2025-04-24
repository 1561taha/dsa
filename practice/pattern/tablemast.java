package practice.pattern;

import java.util.Scanner;

public class tablemast {
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
            for (int j=1;j<=str;j++)
            {
                System.out.print(j);
            }
            for (int j=1;j<=nsp;j++)
            {
                System.out.print(" ");
            }
            for (int j=str;j>=1;j--)
            {
                System.out.print(j);
            }
            str--;
            nsp+=2;
            System.out.println();
        }
    }
}
