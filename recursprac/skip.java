package recursprac;

import java.util.Scanner;

public class skip {
    public static void skipch(String s, int i ,String ans){
       if(i==s.length()){
           System.out.println(ans);
           return;
       }
        char ch=s.charAt(i);
        if (ch=='a')skipch(s,i+1,ans);
        else skipch (s,i+1,ans+ch);

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        skipch(s,0,"");

    }
}
