package stacks;

import java.util.Stack;

public class intopost {
    public static void main(String[] args) {



//        Stack<String> post = new Stack<>();
//        Stack<Character> op = new Stack<>();
//        for (int i=0;i<s.length();i++)
//        {
//            char ch=s.charAt(i);
//            int asc= (int)ch;
//            if (asc>=48 && asc<=57) post.push(ch+"");
//            else if (op.size()==0|| op.peek()=='('|| ch=='(') op.push(ch);
//            else if (ch==')') {
//                while (op.peek()!='(') {
//                    String v2 = post.pop();
//                    String v1 = post.pop();
//                    char x = op.pop();
//                    post.push(v1 + v2 + x);
//                }
//                op.pop();
//
//            }
//            else {
//                if (ch=='+'||ch=='-')
//                {
//                    String v2=post.pop();
//                    String v1=post.pop();
//                    char x=op.pop();
//                    post.push(v1+v2+x);
//                    op.push(ch);
//                } else if (ch=='*'||ch=='/') {
//                    if (op.peek()=='*'||op.peek()=='/')
//                    {
//                        String v2=post.pop();
//                        String v1=post.pop();
//                        char x=op.pop();
//                        post.push(v1+v2+x);
//                        op.push(ch);
//
//                    }
//                    else op.push(ch);
//
//                }
//            }
//        }
//        while (post.size()>1)
//        {
//            String v2=post.pop();
//            String v1=post.pop();
//            char x=op.pop();
//            post.push(v1+v2+x);
//
//        }
//        System.out.println(post.peek());

        String s = "9-(5+3)*4/6";
        Stack<String> post= new Stack<>();
        Stack <Character> op=new Stack<>();

        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            int ascii=(int)ch;

            if(ascii>=48 && ascii<=57)post.add(ch+"");

            else if (op.size()==0 || ch=='(' || op.peek()=='(') {op.add(ch);

            } else if (ch==')') {
                while (op.peek()!='('){
                    String v2=post.pop();
                    String v1=post.pop();

                    char opr=op.pop();
                    post.push(v1+v2+opr);
                }
                op.pop();

            } else if (ch=='+'|| ch=='-') {

                String v2=post.pop();
                String v1=post.pop();

                char opr=op.pop();

                post.push(v1+v2+opr);

                op.push(ch);

            } else if (ch=='*'|| ch=='/') {
                if(op.peek()=='*' || op.peek()=='/'){
                    String v2=post.pop();
                    String v1=post.pop();

                    char opr=op.pop();
                    post.push(v1+v2+opr);
                    op.push(ch);
                }
                else {
                    op.push(ch);
                }

            }
        }

        while (post.size()>1){
            String v2=post.pop();
            String v1=post.pop();

            char opr=op.pop();

            post.push(v1+v2+opr);
        }

        System.out.println(post.peek());
    }
}
