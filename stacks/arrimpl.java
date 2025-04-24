package stacks;

public class arrimpl {
    public static class Stacks{
        int [] arr= new int[50];
        int idx=0;
        void push(int x){
            arr[idx++]=x;

        }
        int pop (){
            if (idx==0)
            {
                System.out.println("stack is empty");
                return -1;
            }
            int top=arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }
        int peek(){
            if (idx==0){
                System.out.println("stack is empty");
                return -1;
            }
            return arr[idx-1];
        }
        void display(){
            for (int i=0;i<idx;i++)
            {
                System.out.print(arr[i]);
            }
            System.out.println();
        }
        int size(){
            return idx;
        }
        int capacity(){
            return arr.length;
        }
        boolean isEmpty(){
            if(idx==0) return true;
            else return false;
        }
        boolean isFull(){
            if(idx==arr.length)return true;
            else return false;




        }

    }
    public static void main(String[] args) {
        Stacks st=new Stacks();
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.display();
        st.pop();
        st.display();
        System.out.println(st.peek());

    }
}
