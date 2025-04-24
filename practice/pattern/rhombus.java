package practice.pattern;

import java.util.Scanner;

public class rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = n - 1;
        int nst = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" ");

            }


            for (int k = 1; k <= nst; k++) {
                System.out.print("*");

            }
            nsp--;
            System.out.println();


        }
    }
}
