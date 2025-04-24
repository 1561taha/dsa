package recursprac;

import java.util.Scanner;

public class revst {

    public static  String reverse(String s,int idx)
    {
        if (idx==s.length())
        {
            return "";
        }
        return reverse(s,idx+1)+ s.charAt(idx);
    }
    public static  boolean pal(String s,int l,int r)
    {
        if (l>=r)
        {
            return true;
        }

        return (s.charAt(l)==s.charAt(r) && pal(s,l+1,r-1) );
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(reverse(s,0));
        String rev=reverse(s,0);
        System.out.println(rev);

        if (s.equals(rev))
        {
            System.out.println(s+" is palindrome");
        }
        else {
            System.out.println(s+" is not palindrome");
        }

        if (pal(s,0,s.length()-1))
        {
            System.out.println(s+" is palindrome");
        }
        else {
            System.out.println(s+" is not palindrome");
        }


    }
}
