package recursprac;

import java.util.Scanner;

public class altsum {
    public static int sum(int n)
    {

        int s=0;
        if (n==1)
        {
            return 1;
        }

        if (n%2==0) {
            s = sum(n-1)-n;
        }
        else {
            s=sum(n-1)+n;
        }

        return s;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a no");
        int n=sc.nextInt();
        System.out.println(sum(n));


    }
}
