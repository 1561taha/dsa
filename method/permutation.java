package method;

import java.util.Scanner;

public class permutation {
    public static double fact(double n) {
        int fact = 1;
        for (double i = n; i >= 1; i--) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
int b=n-r;
        // Calculate factorials separately
        double nFact = fact(n);
        double nMinusRFact = fact(b);

        // Calculate permutation
        double pt = (double) nFact / nMinusRFact; // Perform division after calculating both factorials
        System.out.println(pt);
    }
}
