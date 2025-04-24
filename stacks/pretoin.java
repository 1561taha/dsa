package stacks;

import java.util.Stack;

public class pretoin {
    public static void main(String[] args) {
        String pre= "-9/*+5346";
        Stack <String> val= new Stack<>();

        for (int i=pre.length()-1;i>=0;i--)
        {
            char ch=pre.charAt(i);
            int asc=(int)ch;
            if (asc>=48 && asc<=57) val.push(ch+"");
            else {
                String v1=val.pop();
                String v2=val.pop();
                char op=ch;
                val.push('('+v1+op+v2+')');
            }
        }
        System.out.println(val.peek());
    }
}
