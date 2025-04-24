package recursprac;

import java.util.Scanner;

public class keypad {
    public static  void comb(String s,String []kp,String cr)
    {
        if (s.length()==0)
        {
            System.out.print(cr + " ");
            return;
        }
        int  dig=s.charAt(0)-'0';
        String alpha=kp[dig];
        for (int i=0;i<alpha.length();i++)
        {
            comb(s.substring(1),kp,cr+alpha.charAt(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String s=sc.nextLine();
        String[] kp={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        comb(s,kp,"");

    }
}
