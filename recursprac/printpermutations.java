package recursprac;

import java.util.Scanner;

public class printpermutations {
    public static void print (String ans, String s){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        for (int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            String left=s.substring(0,i);
            String right=s.substring(i+1);
            print(ans+ch,left+right);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();

        print("",s);
    }
}
