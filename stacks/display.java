package stacks;

import java.util.Scanner;
import java.util.Stack;

public class display {
    public static void displayrev(Stack<Integer> st)
    {
        if (st.isEmpty()) return;
        int x=st.peek();
        System.out.print(st.peek()+" ");
        st.pop();
        displayrev(st);
        st.push(x);
    }
    public static void displayrec(Stack<Integer> st)
    {
        if (st.isEmpty()) return;
        int x=st.peek();

        st.pop();
        displayrec(st);
        st.push(x);
        System.out.print(st.peek()+" ");

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        System.out.println("enter size of stacck");
        int n=sc.nextInt();
        System.out.println("enter "+ n+ " elements");
        for (int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            st.push(x);
        }
        displayrev(st);
        System.out.println();
        displayrec(st);


    }
}
