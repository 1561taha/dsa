package recursprac;

import java.util.Scanner;

public class subsets {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        printsubset(s,0,"");
    }

    private static void printsubset(String s, int i, String ans) {
       if (i==s.length()){
           System.out.println(ans);
           return;
       }
        char ch=s.charAt(i);
        printsubset(s,i+1,ans);
        printsubset(s,i+1,ans+ch);

    }
}
