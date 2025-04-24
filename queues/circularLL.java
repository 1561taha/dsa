package queues;

public class circularLL {
    public static class Node {
        int val;
        Node next;
        Node (int val){
            this.val=val;
        }
    }
    public static class  CQL{
        Node head=null;
        Node tail =null;
        int size=0;
        void add(int x)
        { Node temp= new Node(x);
            if (size==0) {
                head=tail=temp;

            }
            else {
                tail.next=temp;
                tail=temp;
                tail.next=head;
            }
            size++;
        }
        int remove()throws Exception{
            if (size==0){
                throw new Exception("QUEUE is empty!");

            }
            else {
                int x=head.val;
                head=head.next;
                tail.next=head;
                size--;
                return x;
            }

        }

        int peek()throws Exception{
            if (size==0){
                throw new Exception("QUEUE is empty!");

            }
            else {
                return head.val;
            }
        }
        void display (){
            if (size==0){
                System.out.println("queue is empty!");
                return;
            }
            else {
                Node temp=head;

                while (temp.next!=head)
                {
                    System.out.print(temp.val+ " ");
                    temp=temp.next;
                }
                System.out.print(temp.val);
                System.out.println();
            }
        }
        boolean isEmpty(){
            if (size==0) return true;
            else return false;
        }
    }
    public static void main(String[] args)throws Exception{
        CQL q=new CQL();
        q.display();
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());
        System.out.println(q.size);



    }
}
