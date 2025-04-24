package recursprac;

import java.util.Scanner;

public class hcf {
    public static int gcd(int x, int y){
        if (x==0) return y;
//        if ()
        return gcd(y%x,x);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int y= sc.nextInt();
        int g=gcd(x,y);
        System.out.println(g);
    }
}
