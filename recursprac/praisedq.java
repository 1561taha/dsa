package recursprac;

import java.util.Scanner;

public class praisedq {
    public static int raised(int p, int q)
    {
        if (q==0)
        {
            return 1;
        }
        return p* raised(p,q-1);
    }
    public static int raised2(int p , int q)
    {
        if (q == 0)
        {
            return 1;

        }

        if (q%2==0)
        {
            return raised2(p,q/2)*raised2(p,q/2);
        }
        else {
            return p*raised2(p,q/2)*raised2(p,q/2);
        }

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int p=sc.nextInt();
        System.out.println(" enter power");
        int q= sc.nextInt();
        System.out.println(raised(p,q));
        System.out.println(raised2(p,q));
    }
}
