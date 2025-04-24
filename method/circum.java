package method;

import java.util.Scanner;

public class circum {
    public static double circumferernce (double r)
    {
        double c=2*3.14*r;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double r=sc.nextInt();
        double c=circumferernce(r);
        System.out.println(c);

    }
}
