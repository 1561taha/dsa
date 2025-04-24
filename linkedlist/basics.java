package linkedlist;

public class basics {
    public static void display(Node a)
    {
        Node temp=a;
        while (temp!=null)
        {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }
    public static void displayrec(Node head)
    {
        if (head== null) return;

        System.out.print(head.data+ " ");
        displayrec(head.next);


    }
    public static  class Node{
        int data;
        Node next;
        public  Node (int data)
        {
            this.data=data;
        }

    }
    public static void main(String[] args) {

        Node a= new Node(3);
        Node b= new Node(5);
        Node c= new Node(1);
        Node d= new Node(8);
        Node e= new Node(4);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        display(a);
        System.out.println();
        displayrec(a);
//         Node temp=a;
//        while(temp!=null)
//        {
//            System.out.print(temp.data+ " ");
//            temp=temp.next;
//        }


    }
}
