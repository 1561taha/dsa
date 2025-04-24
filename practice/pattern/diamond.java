package practice.pattern;

import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int str =1;
        int nsp=n/2;
        int mid=n/2+1;
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=nsp;j++)
            {
                System.out.print(" ");

            }
            for (int k=1;k<=str;k++)
            {
                System.out.print("*");
            }
            if (i<mid) {
                str += 2;
                nsp--;
            }
            else
            {
                str-=2;
                nsp++;
            }
            System.out.println();
        }
    }
}
