package stacks;

import java.util.Scanner;
import java.util.Stack;

public class enteratidx {
//    public static Stack enterusingst(Stack a,int idx , int x)
//    {
//
//        return a;
//    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Stack <Integer> a=new Stack<>();

        System.out.println("enter size of stack");
        int n=sc.nextInt();

        System.out.println("enter "+ n+ "elements");
        for (int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            a.push(x);
        }

        System.out.println("enter index no");
        int idx=sc.nextInt();
        System.out.println("enter the element");
        int x=sc.nextInt();

        System.out.println(a);

//        System.out.println(enterusingst(a,idx,x));

        Stack <Integer> b= new Stack<>();
        int p=a.size()-idx;
        for (int i=0;i<p;i++)
        {
            b.push( a.pop());
        }
        b.push(x);
        for(int i=0;b.size()>0;i++)
        {
            a.push(b.pop());
        }
        System.out.println(a);

    }
}
