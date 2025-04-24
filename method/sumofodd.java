package method;

import java.util.Scanner;

public class sumofodd {
    public static int oddsum(int n){
        int sum=0;
        for (int i=1;i<=n;i++)
        {
            if (i%2!=0)
            {
                sum+=i;
            }
            else {
                sum+=0;
            }
        }
 return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=oddsum(n);
        System.out.println(sum);

    }
}
