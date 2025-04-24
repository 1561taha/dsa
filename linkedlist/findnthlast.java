package linkedlist;

public class findnthlast {
//    public static Node nthNode1(Node head, int n)
//    {
//        int size=0;
//        Node temp=head;
//        while (temp!=null)
//        {
//            temp=temp.next;
//            size++;
//
//        }
//        int m=size-n+1;
//        temp=head;
//        for (int i=1;i<=m-1;i++)
//        {
//            temp=temp.next;
//        }
//        return temp;
//    }
//    public static Node nthNode(Node head,int n)
//    {
//        Node slow=head;
//        Node fast=head;
//        for (int i=1;i<=n;i++)
//        {
//            fast=fast.next;
//        }
//        while (fast!=null)
//        {
//            fast=fast.next;
//            slow=slow.next;
//        }
//        return slow;
//    }

    public static Node nthNode(Node head,int n)
    {
        Node temp=head;
        int size=0;
        while (temp!=null)
        {
            size++;
            temp=temp.next;
        }
        int m=size-n+1;
        temp=head;
        for (int i=1;i<=m-1;i++)
        {
            temp=temp.next;
        }
        return temp;
    }

    public static Node nthnode1(Node head,int n)
    {
        Node slow=head;
        Node fast=head;
        for (int i=1;i<=n;i++)
        {
            fast=fast.next;
        }

        while(fast!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }

        return slow;

    }
    public static class Node {
        int data;
        Node next;
        Node (int data)
        {
            this.data=data;
        }
}
public static void main(String[] args) {
        Node a= new Node(3);
    Node b= new Node(4);
    Node c= new Node(5);
    Node d= new Node(6);
    Node e= new Node(7);
    Node f= new Node(8);

    a.next=b;
    b.next=c;
    c.next=d;
    d.next=e;
    e.next=f;

    Node temp=nthNode(a,3);
    System.out.println(temp.data);

    Node temp1=nthnode1(a,3);
    System.out.println(temp1.data);


}
}
