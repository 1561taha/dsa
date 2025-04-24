package stacks;

import java.util.Stack;

public class ineval {
    public static void main(String[] args) {
        String s="9-(5+3)*4/6";
        Stack <Integer> val= new Stack<>();
        Stack <Character> op= new Stack<>();
        for (int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);

            int asc=(int)ch;

            if (asc>=48 && asc<=57) val.push(asc-48);
            else if (op.size()==0 || op.peek()=='(' || ch=='(') op.push(ch);
            else if (ch==')')
            {
                while (op.peek()!='(')
                {
                    int v2=val.pop();
                    int v1= val.pop();

                    if (op.peek()=='+') val.push(v1+v2);
                    if (op.peek()=='-') val.push(v1-v2);
                    if (op.peek()=='*') val.push(v1*v2);
                    if (op.peek()=='/') val.push(v1/v2);
                    op.pop();

                }
                op.pop();

            }
            else {
                if (ch=='+' || ch=='-')
                {
                    int v2=val.pop();
                    int v1= val.pop();

                    if (op.peek()=='+') val.push(v1+v2);
                    if (op.peek()=='-') val.push(v1-v2);
                    if (op.peek()=='*') val.push(v1*v2);
                    if (op.peek()=='/') val.push(v1/v2);
                    op.pop();
                    op.push(ch);
                }

                if (ch=='*' || ch=='/')
                {
                    if (op.peek()=='*' || op.peek()=='/') {
                        int v2 = val.pop();
                        int v1 = val.pop();

                        if (op.peek() == '*') val.push(v1 * v2);
                        if (op.peek() == '/') val.push(v1 / v2);
                        op.pop();
                        op.push(ch);
                    }
                    else op.push(ch);
                }
            }
        }

        while (val.size()>1)
        {
            int v2=val.pop();
            int v1= val.pop();

            if (op.peek()=='+') val.push(v1+v2);
            if (op.peek()=='-') val.push(v1-v2);
            if (op.peek()=='*') val.push(v1*v2);
            if (op.peek()=='/') val.push(v1/v2);
            op.pop();

        }
        System.out.println(val.peek());
    }
}
