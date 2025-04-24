package recursion;

import java.util.Scanner;

public class ppowerq {
    public static int power(int p, int q)
    { if (q==1)
    {
        return p;
    }
        int ans=1;
             ans=p*power(p,q-1);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number");
        int p=sc.nextInt();
        System.out.println("enter power");
        int q=sc.nextInt();
        int ans=power(p,q);
        System.out.println(ans);

    }
}
