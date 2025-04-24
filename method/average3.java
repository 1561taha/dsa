package method;

import java.util.Scanner;

public class average3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
     int ave=   calculateavarge(a,b,c);
        System.out.println(ave);


    }

    private static int calculateavarge(int a, int b, int c) {
        int ave=(a+b+c)/3;
        return ave;

    }
}
