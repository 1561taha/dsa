package stacks;

import java.util.Stack;

public class postfixtoprefix {
    public static void main(String[] args) {
        String post = "953+4*6/-";
        Stack <String> val= new Stack<>();
        for (int i=0;i<post.length();i++)
        {
            char ch=post.charAt(i);
            int asc=(int)ch;
            if (asc>=48 && asc<=57) val.push(ch+"");
            else {
                String v2=val.pop();
                String v1= val.pop();
                char op=ch;
                val.push(op+v1+v2);
            }

        }
        System.out.println(val.peek());
    }
}
