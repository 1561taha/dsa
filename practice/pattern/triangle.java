package practice.pattern;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int st=1;

        for (int i=1;i<=n;i++)
        {int a=1;
            int b=1;
            for (int j=1;j<=st;j++)
            { int d=b+64;
                char ch;
                ch=(char)d;


                System.out.print(ch);
              a+=2;
              b++;
            }
            st++;
            System.out.println();


        }
    }
}
