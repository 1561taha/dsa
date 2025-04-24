package recursprac;

import java.util.Scanner;

public class nocons1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        printbin(n,0,"");

    }

    private static void printbin(int n,int i,String ans) {
     int m=ans.length();
     if (m==n){
         System.out.println(ans);
         return;
     }

     if (m==0 || ans.charAt(i-1)=='0'){
         printbin(n,i+1,ans+0);
         printbin(n,i+1,ans+1);
     }
     else printbin(n,i+1,ans+0);
    }
}
