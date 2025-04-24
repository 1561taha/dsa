package stacks;

import java.util.Stack;

public class stockspan {
    public static void main(String[] args) {
        int [] arr={100,80,60,70,60,75,85};
        Stack<Integer> st= new Stack<>();
        int m=arr.length;

        int[] prev=new int[m];

        prev[0]=1;
        st.push(0);

        for (int i=1;i<m;i++)
        {
            while (st.size()>0 && arr[st.peek()] < arr[i])
            {
                st.pop();
            }

            if (st.size()==0) prev[i]=i+1;

            else prev[i]=i-st.peek();

            st.push(i);
        }
        for (int i=0;i<m;i++)
        {
            System.out.print(prev[i]+ " ");
        }
    }
}
