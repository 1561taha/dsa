package stacks;

import java.util.Scanner;
import java.util.Stack;

public class patb {
    public static void pushatbrec(Stack<Integer> st,int x)
    {
        if (st.isEmpty())
        { st.push(x);
            return ;}

        int top=st.pop();
        pushatbrec(st,x);
        st.push(top);

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        Stack<Integer> st=new Stack<>();
        System.out.println("enter size of stack");
        int n=sc.nextInt();
        for (int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            st.push(x);
        }
        System.out.println("enter element");
        int x=sc.nextInt();
        System.out.println(st);
        pushatbrec(st,x);
        System.out.println();
        System.out.println(st);

    }
}
