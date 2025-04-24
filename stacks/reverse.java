package stacks;

import java.util.Scanner;
import java.util.Stack;

public class reverse {
    public static void reverseitr(Stack<Integer> st)
    {
        Stack<Integer> b=new Stack<>();
        while (st.size()>0)
        {
            b.push(st.pop());
        }
        Stack <Integer> c=new Stack<>();
        while (b.size()>0)
        {
            c.push(b.pop());

        }
        while (c.size()>0)
        {
            st.push(c.pop());
        }
    }
    public static void  pushatbottom(Stack<Integer> st,int x)
    {
        if (st.size()==0) {
            st.push(x);
            return;
        }

        int top=st.pop();
        pushatbottom(st,x);
        st.push(top);
    }
    public static void reverserec(Stack <Integer> st)
    {
        if (st.size()==1)
        {
            return;
        }

        int top=st.pop();
        reverserec(st);
        pushatbottom(st,top);


    }
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of stack");
        int n=sc.nextInt();
        System.out.println("enter "+ n+" elements");
        for (int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
//        reverseitr(st);
        reverserec(st);
        System.out.println(st);
    }
}
