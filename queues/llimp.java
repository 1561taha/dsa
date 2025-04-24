package queues;

public class llimp {
    public static  class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }
        public static class QueueLL{
            Node head=null;
            Node tail= null;
            int size=0;

            void add(int x){
                if (size==0)
                {
                    Node temp=new Node(x);
                    head=temp;
                    tail=temp;

                }
                else {
                    tail.next=new Node(x);
                    tail=tail.next;
                }
                size++;
            }
            int remove (){
                if (size==0)
                {
                    System.out.println("queue is empty");
                    return -1;
                }
                else {
                    int x= head.val;
                    head= head.next;
                    size--;
                    return x;
                }
            }
            int peek (){
                if (size==0)
                {
                    System.out.println("queue is empty");
                    return -1;
                }
                else {
                    return head.val;
                }
            }
            void display(){
                Node temp= head;
                while (temp!=null){
                    System.out.print(temp.val + " ");
                    temp=temp.next;
                }
                System.out.println();

            }
            boolean IsEmpty(){
                if (size==0) return true;
                else return false;
            }
        }

    public static void main(String[] args) {
        QueueLL q= new QueueLL();
        System.out.println(q.IsEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.display();
        q.remove();
        System.out.println(q.peek());
        System.out.println(q.size);
        System.out.println(q.IsEmpty());
        q.display();
    }
}
