package recursprac;

import java.util.Scanner;

public class sumofdig {
    public static int sod(int n)
    {
        int sum=0;
        if (n==0)
        {
            return 0;
        }
        sum=n%10+sod(n/10);

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sod(n));
    }
}
