package stacks;

import java.util.Stack;

public class infix_evaluation {
    public static void main(String[] args) {

//       Stack <Integer> ans=new Stack<>();
//       Stack <Character> st= new Stack<>();
//
//       for (int i=0;i<s.length();i++){
//           char ch= s.charAt(i);
//           int asc=(int)ch;
//           if (asc>=48 && asc<=57){
//               ans.push(asc-48);
//           }
//           else if (st.size()==0 || st.peek()=='('|| ch=='(') st.push(ch);
//           else if (ch==')'){
//               while (st.peek()!='('){
//                   int v2= ans.pop();
//                   int v1=ans.pop();
//                   char op=st.pop();
//
//                   if (op=='+') ans.push(v1+v2);
//                   if (op=='-') ans.push(v1-v2);
//                   if (op=='*') ans.push(v1*v2);
//                   if (op=='/') ans.push(v1/v2);
//               }
//               st.pop();
//
//           }
//
//           else if (ch=='+'|| ch=='-'){
//               int v2= ans.pop();
//               int v1=ans.pop();
//               char op=st.pop();
//
//               if (op=='+') ans.push(v1+v2);
//               if (op=='-') ans.push(v1-v2);
//               if (op=='*') ans.push(v1*v2);
//               if (op=='/') ans.push(v1/v2);
//
//               st.push(ch);
//           }
//           else{
//               if (ch=='*'|| ch=='/'){
//                   if (st.peek()=='*'||st.peek()=='/'){
//                       int v2= ans.pop();
//                       int v1=ans.pop();
//                       char op=st.pop();
//
//
//                       if (op=='*') ans.push(v1*v2);
//                       if (op=='/') ans.push(v1/v2);
//
//                       st.push(ch);
//
//                   }
//                   else st.push(ch);
//               }
//           }
//
//       }
//       while (ans.size()>1){
//           int v2= ans.pop();
//           int v1=ans.pop();
//           char op=st.pop();
//
//           if (op=='+') ans.push(v1+v2);
//           if (op=='-') ans.push(v1-v2);
//           if (op=='*') ans.push(v1*v2);
//           if (op=='/') ans.push(v1/v2);
//
//       }

        String s = "9-(5+3)*4/6";

        Stack <Character> op=new Stack<>();
        Stack <Integer> value=new Stack<>();

        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int ascii=(int)ch;
            if(ascii >=48 && ascii<=57)value.add(ascii-48);

            else if (op.size()==0 || ch=='('|| op.peek()=='(') op.push(ch);

            else if (ch==')') {
                while (op.peek()!='('){
                    int v2=value.pop();
                    int v1=value.pop();

                    if(op.peek()=='+')value.push(v1+v2);
                    if(op.peek()=='-')value.push(v1-v2);
                    if (op.peek()=='*')value.push(v1*v2);
                    if(op.peek()=='/')value.push(v1/v2);

                    op.pop();


                }
                op.pop();

            } else if (s.charAt(i)=='+' || s.charAt(i)=='-'){
                int v2=value.pop();
                int v1=value.pop();
                if(op.peek()=='+')value.push(v1+v2);
                if(op.peek()=='-')value.push(v1-v2);
                if (op.peek()=='*')value.push(v1*v2);
                if(op.peek()=='/')value.push(v1/v2);

                op.pop();
                op.push(ch);

            }
            else if (ch=='*'|| ch=='/'){
                if (op.peek()=='*'||op.peek()=='/'){
                    int v2=value.pop();
                    int v1=value.pop();

                    if(op.peek()=='*') value.push(v1*v2);
                    if(op.peek()=='/') value.push(v1/v2);

                    op.pop();
                    op.push(ch);

                } else if (op.peek()=='+' || op.peek()=='-') {
                    op.push(ch);

                }
            }

        }

        while (value.size()>1){
            int v2=value.pop();
            int v1=value.pop();

            if(op.peek()=='+')value.push(v1+v2);
            if(op.peek()=='-')value.push(v1-v2);
            if (op.peek()=='*')value.push(v1*v2);
            if(op.peek()=='/')value.push(v1/v2);

            op.pop();
        }

        System.out.println(value.peek());

    }
}
