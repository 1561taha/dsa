package stacks;

import java.util.Scanner;
import java.util.Stack;

public class movestack {
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

        Stack <Integer> b= new Stack<>();

        while (st.size()>0)
        {
            b.push(st.pop());
        }

        Stack <Integer> ans= new Stack<>();

        while (b.size()>0)
        {
            ans.push(b.pop());
        }

        System.out.println(st);
        System.out.println(b);
        System.out.println(ans);
    }

}
