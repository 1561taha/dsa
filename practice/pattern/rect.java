package practice.pattern;

import java.util.Scanner;

public class rect {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int st=1;
        for (int i=1;i<=n;i++)
        {

           for (int j=1;j<=n;j++)
           {int d=st+64;
               char ch;
               ch=(char)d;
               System.out.print(ch);
           }
           st++;
            System.out.println();
        }

    }
}
