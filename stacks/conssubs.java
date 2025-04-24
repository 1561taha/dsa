package stacks;

import java.util.Stack;

public class conssubs {
//    public static int [] remove (int[]arr)
//    {
//        Stack<Integer> st= new Stack<>();
//
//        for (int i=0;i<arr.length;i++)
//        {
//            if (st.isEmpty()|| st.peek()!=arr[i]) st.push(arr[i]);
//
//            else if (st.peek()==arr[i]&& (i==arr.length-1 ||arr[i]!=arr[i+1])){
//                st.pop();
//
//            }
//        }
//        int [] res=new int[st.size()];
//
//        for (int i=res.length-1;i>=0;i--)
//        {
//            res[i]=st.pop();
//        }
//        return res;
//    }

    public static int[] remove (int[] arr)
    {
        Stack <Integer> st=new Stack<>();
        for (int i=0;i<arr.length;i++)
        {
            if (st.size()==0 || st.peek()!=arr[i]) st.push(arr[i]);

            else if (st.peek()==arr[i] && (i==arr.length-1 || st.peek()!=arr[i+1])) st.pop();
        }

        int [] res= new int [st.size()];

        for (int i=res.length-1;i>=0;i--)
        {
            res[i]=st.pop();
        }
        return res;
    }
    public static void main(String[] args) {
        int [] arr={1,2,4,4,5,6,8,8,8,9,4,4,4,7,2,2};
        int [] res=remove(arr);
        for (int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+ " ");
        }
//
//        String a="abcd";
//        StringBuilder b= new StringBuilder(a);
//        b.reverse();
//        b.toString()


    }
}
