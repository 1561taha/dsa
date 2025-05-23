package backtracking;

import java.util.Scanner;

public class perm {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();

        printperm(s,"");
    }

    private static void printperm(String s, String ans) {
        if (s.length()==0){
            System.out.println(ans);
            return;
        }
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            String left=s.substring(0,i);
            String right=s.substring(i+1);
            printperm(left+right,ans+ch);
        }

    }
}
