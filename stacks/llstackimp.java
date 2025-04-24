package stacks;

public class llstackimp {
    public static class Node {
        int data;
        Node next;
        Node (int data){
            this.data=data;
        }
    }
    public static class LLStack{
        Node head=null;
        int size=0;

        void push(int x)
        {
            Node temp=new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }
        int pop()
        {
            if (size==0)
            {
                System.out.println("stack is empty");
                return -1;
            }
            int top=head.data;
            head=head.next;
            size--;
            return top;
        }
        int peek ()
        {
            if (size==0){
                System.out.println("stack is empty");
                return -1;
            }
            return head.data;
        }
        void displayrev()
        {
            Node temp=head;
            while (temp!=null)
            {
                System.out.print(temp.data+ " ");
                temp=temp.next;
            }
            System.out.println();
        }
        void displayrec(Node h)
        {
            if (h==null) return ;
            displayrec(h.next);
            System.out.print(h.data+ " ");

        }
        void display()
        {
            displayrec(head);
            System.out.println();
        }
        boolean isEmpty()
        {
            if (size==0) return true;
            else return false;
        }
    }

    public static void main(String[] args) {
        LLStack st= new LLStack();
        System.out.println(st.isEmpty());
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.display();
        st.displayrev();
        st.pop();
        st.display();
        System.out.println(st.size);


    }
}
