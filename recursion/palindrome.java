package recursion;

import java.util.Scanner;

public class palindrome {
    public static boolean pal(String s,int st, int lt)
    {
        if (st>=lt) return true;

        return s.charAt(st)==s.charAt(lt) && pal(s,st+1,lt-1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(pal(s,0,s.length()-1));

    }


}
