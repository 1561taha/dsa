package recursion;

import java.util.Scanner;

public class revst {
    public static String rev(String s)
    {
        if (s.length()==0)
        {
            return "";

        }

        String ans=rev(s.substring(1));

        return ans+s.charAt(0);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string");
        String s=sc.nextLine();
        System.out.println(rev(s));

    }
}
