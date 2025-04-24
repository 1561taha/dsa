package stacks;

import java.util.Stack;

public class prefixevaluation {
    public static void main(String[] args) {
        String pre= "-9/*+5346";
        Stack <Integer> val= new Stack<>();
        for (int i=pre.length()-1;i>=0;i--)
        {
            char ch= pre.charAt(i);
            int asc= (int) ch;
            if (asc>=48 && asc<=57) val.push(asc-48);
            else {
                int v1=val.pop();
                int v2=val.pop();
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
