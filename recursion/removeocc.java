package recursion;

import java.util.Scanner;

public class removeocc {

    public static String occc2(String s)
    {
        if (s.length()==0)
        {
            return "";
        }
        String ans=occc2(s.substring(1));
        if (s.charAt(0)!='a')
        {
            return s.charAt(0)+ans;
        }
        else {
            return ans;
        }
    }
    public static String occ(String s,int idx)
    {
        if(idx==s.length())
        {
            return "";
        }

        String ans=occ(s,idx+1);
        if (s.charAt(idx)!='a')
        {
            return s.charAt(idx)+ans;
        }
        else {
            return ans;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string");

        String s=sc.nextLine();
        System.out.println(occ(s,0));
        System.out.println(occc2(s));

    }
}
