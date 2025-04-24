package practice.pattern;

import java.util.Scanner;

public class numzoom {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int min;
        for (int i=1;i<=2*n-1;i++)
        {
            for (int j=1;j<=2*n-1;j++)
            {
                int a=i;
                if (i<n) a=i;
                else a=2*n-i;

                int b=j;
                if (j<n) b=j;
                else b=2*n-j;

                if (a<b) min=a;
                else min=b;

                System.out.print(n+1-min);

            }
            System.out.println();
        }
    }
}
