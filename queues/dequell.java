package queues;

import java.util.LinkedList;
import java.util.Queue;

public class dequell {
    public static class Node {
        int val;
        Node next;
        Node prev;
        Node(int val) {
            this.val=val;
        }

    }
    public static class DQLL{
        Node head=null;
        Node tail =null;
        int size=0;
        void addatend(int x) {
            Node temp=new Node(x);
            if (size==0){
                head=tail=temp;
            }
            else {
                tail.next=temp;
                temp.prev=tail;
                tail=temp;
            }
            size++;

        }
        void addatst(int x){
            Node temp=new Node (x);
            if (size==0){
                addatend(x);
            }
            else {
                head.prev=temp;
                temp.next=head;
                head=temp;
            }
            size++;

        }
        int removeatst()throws Exception{
            if (size==0)
            {
                throw new Exception("queue is empty!");
            }
            else {
                int x=head.val;
                head=head.next;
                head.prev=null;
                size--;
                return x;

            }
        }
        int removeatend()throws Exception{
            if (size==0)
            {
                throw new Exception("queue is empty!");
            }
            int x=tail.val;
            tail=tail.prev;
            tail.next=null;
            size--;
            return x;
        }
        int peekatst() throws Exception{
            if (size==0)
            {
                throw new Exception("queue is empty!");
            }
            else return head.val;

        }
        int peekatend() throws Exception{
            if (size==0)
            {
                throw new Exception("queue is empty!");
            }
            else return tail.val;

        }

        void display(){
            Node temp=head;
            while (temp!=null){
                System.out.print(temp.val + " ");
                temp=temp.next;
            }
            System.out.println();
        }

    }
    public static void main(String[] args) throws Exception {
        DQLL q= new DQLL();
        q.addatend(1);
        q.addatend(2);
        q.display();
        q.addatst(3);
        q.addatst(4);
        q.display();
        q.addatend(5);
        q.display();
        q.removeatend();
        q.display();
        q.removeatst();
        q.display();
        System.out.println(q.peekatend());
        System.out.println(q.peekatst());
        System.out.println(q.size);




    }
}
