package stacks;

import java.util.Stack;

public class postfixevaluation {
    public static void main(String[] args) {


        String post = "953+4*6/-";
        Stack<Integer> val = new Stack<>();
        for (int i=0;i<post.length();i++)
        {
            char ch=post.charAt(i);
            int asc=(int)ch;
            if (asc>=48 && asc<=57) val.push(asc-48);
            else {
                int v2=val.pop();
                int v1=val.pop();
                char op=ch;
                if (ch=='+') val.push(v1+v2);
                if (ch=='-') val.push(v1-v2);
                if (ch=='*') val.push(v1*v2);
                if (ch=='/') val.push(v1/v2);

            }
        }
        System.out.println(val.peek());

    }
}
