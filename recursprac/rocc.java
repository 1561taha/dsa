package recursprac;

import java.util.Scanner;

public class rocc {

    public static  String occ2(String s)
    {
        if (s.length()==0)
        {
            return "";
        }
        if (s.charAt(0)!='a')
        {
            return s.charAt(0)+occ2(s.substring(1));
        }
        else
        {
            return occ2(s.substring(1));
        }
    }
    public static String occ(String s,int idx)
    {
        if (idx==s.length())
        {
            return "";
        }

        if (s.charAt(idx)!='a')
        {
            return s.charAt(idx)+occ(s,idx+1);
        }
        else {
            return occ(s,idx+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();


        System.out.println(occ(s,0));
        System.out.println(occ2(s));

    }
}
