package stacks;

import java.util.Stack;

public class intopre {
    public static void main(String[] args) {
//        String s="9-(5+3)*4/6";
//        Stack <String> pre=new Stack<>();
//        Stack <Character> op= new Stack<>();
//
//        for (int i=0; i<s.length();i++)
//        {
//            char ch= s.charAt(i);
//            int asc=(int)ch;
//            if (asc>=48 && asc<=57) pre.push(ch+"");
//            else if (op.size()==0 || op.peek()=='('|| ch=='(') op.push(ch);
//            else if (ch==')')
//            {
//                while (op.peek()!='(')
//                {
//                    String v2=pre.pop();
//                    String v1=pre.pop();
//                    char x=op.pop();
//                    pre.push(x+v1+v2);
//
//                }
//                op.pop();
//
//            }
//            else {
//                if (ch=='+'||ch=='-')
//                {
//                    String v2=pre.pop();
//                    String v1=pre.pop();
//                    char x=op.pop();
//                    pre.push(x+v1+v2);
//                    op.push(ch);
//                }
//                if (ch=='*'|| ch=='/')
//                {
//                    if (op.peek()=='*'|| op.peek()=='/')
//                    {
//                        String v2=pre.pop();
//                        String v1=pre.pop();
//                        char x=op.pop();
//                        pre.push(x+v1+v2);
//                        op.push(ch);
//                    }
//                    else op.push(ch);
//
//                    }
//                }
//            }
//        while (pre.size()>1)
//        {
//            String v2=pre.pop();
//            String v1=pre.pop();
//            char x=op.pop();
//            pre.push(x+v1+v2);
//
//
//        }
        String s="9-(5+3)*4/6";
       Stack<String> pre= new Stack<>();
       Stack <Character> opr= new Stack<>();

       for (int i=0;i<s.length();i++){
           char ch= s.charAt(i);
           int asc= (int)ch;
           if (asc>=48 && asc<=57) pre.push(ch + "");
           else if (opr.size()==0 || opr.peek()=='('|| ch=='(')opr.push(ch);
           else if (ch==')'){
               while (opr.peek()!='(') {
                   String v2 = pre.pop();
                   String v1 = pre.pop();
                   char op = opr.pop();
                   pre.push(op + v1 + v2);
               }
               opr.pop();

           }
           else {
               if (ch=='+'|| ch=='-'){
                   String v2= pre.pop();
                   String v1=pre.pop();
                   char op=opr.pop();
                   pre.push(op+v1+v2);
                   opr.push(ch);
               }
               else if (ch=='*'|| ch=='/'){
                   if (opr.peek()=='*'|| opr.peek()=='/'){
                       String v2= pre.pop();
                       String v1=pre.pop();
                       char op=opr.pop();
                       pre.push(op+v1+v2);
                       opr.push(ch);

                   }
                   else opr.push(ch);
               }
           }
       }
       while (pre.size()>1){
           String v2= pre.pop();
           String v1=pre.pop();
           char op=opr.pop();
           pre.push(op+v1+v2);

       }
        System.out.println(pre.peek());
        }

    }


