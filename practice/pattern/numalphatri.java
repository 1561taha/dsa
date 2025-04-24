package practice.pattern;

import java.util.Scanner;

public class numalphatri {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
            {char ch;
                int d=j+64;
                ch=(char)d;
                if (i%2==0)
                {
                    System.out.print(ch);
                }
                else {
                    System.out.print(j);
                }

            }
            System.out.println();
        }
    }
}
