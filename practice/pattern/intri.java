package practice.pattern;

import java.util.Scanner;

public class intri {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int st =n;
        for (int i=1;i<=n;i++)
        {
            for (int j=st;j>=1;j--)
            { int d=st+64;
                char ch=(char)d;
                System.out.print(ch);
            }
            st--;
            System.out.println();

        }
    }
}
