package stacks;

import java.util.Scanner;
import java.util.Stack;

public class validparan {
    public static boolean isvalid(String str)
    {
        char [] crr=str.toCharArray();
        Stack <Character> st=new Stack<>();
        for (int i=0;i<crr.length;i++)
        {
            if (crr[i]=='(' )
            {
                st.push(crr[i]);
            }
            else {
                if (st.isEmpty()) return false ;
                char ch=st.pop();
                if (ch=='('&& crr[i]==')') continue;
                else return false;
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        String str=sc.nextLine();
        System.out.println(isvalid(str));


    }
}
