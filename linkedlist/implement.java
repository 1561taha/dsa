package linkedlist;

public class implement {
    public  static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data=data;

        }
    }
    public static  class Linkedlist{
        Node head=null;
        Node tail=null;
        int size=0;
        void insertAtEnd(int val)
        {
            Node t= new Node(val);
            if (head==null)
            {
                head=tail=t;

            }
            else {
               tail.next=t;
                tail=t;
            }
            size++;
        }
        void insertAtHead(int val){
            Node temp=new Node(val);
            if (head==null)
            {
               head=tail=temp;
            }
            else {
                temp.next=head;
                head=temp;
            }
            size++;
        }
        void insertAT(int idx,int val)
        {
            if (idx==0)
            {
                insertAtHead(val);
                return;
            } else if (idx==size) {
                insertAtEnd(val);
                return;

            }
            else {
                Node temp=head;
                Node t=new Node(val);
                for (int i=1;i<=idx-1;i++)
                {
                    temp=temp.next;
                }
                t.next=temp.next;
                temp.next=t;

            }
            size++;
        }
        void delete(int idx)
        {
            Node temp=head;
            for (int i=1;i<=idx-1;i++)
            {
                temp=temp.next;
            }
            temp.next=temp.next.next;
            size--;
        }
        int valueOf(int idx)
        {
            Node temp=head;
            for (int i=1;i<=idx;i++)
            {
                temp=temp.next;
            }
            return temp.data;
        }
         void display(){
            Node temp= head;
            while (temp!=null)
            {
                System.out.print(temp.data + " ");
                temp=temp.next;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.insertAtHead(88);
        ll.insertAtEnd(3);
        ll.insertAtEnd(5);
        ll.insertAtEnd(7);
        ll.insertAtEnd(1);

        ll.insertAtHead(45);

        ll.insertAT(1,10);
        ll.display();
        System.out.println(ll.size);
        ll.delete(2);
        ll.display();
        System.out.println(ll.size);
        System.out.println(ll.valueOf(3));


    }
}

//public static class Node{
//    int data;
//    Node next;
//    Node(int data){
//        this.data=data;
//    }
//}
//public static class Linkedlist{
//    Node head=null;
//    Node tail=null;
//    int size=0;
//    void insertAtEnd(int val){
//        Node temp=new Node(val);
//        if (head==null)
//        {
//            head=tail=temp;
//        }
//        else {
//            tail.next=temp;
//            tail=temp;
//        }
//        size++;
//    }
//    void insertAtHead(int val){
//        Node temp=new Node(val);
//        if (head==null)
//        {
//            insertAtEnd(val);
//            return;
//        }
//        else {
//            temp.next=head;
//            head=temp;
//        }
//        size++;
//    }
//    void insertAt(int idx,int val)
//    {
//        if (idx==0)
//        {
//            insertAtHead(val);
//            return;
//        } else if (idx==size) {
//            insertAtEnd(val);
//            return;
//
//        }
//        else {
//            Node temp=head;
//            Node t= new Node(val);
//            for (int i=1;i<=idx-1;i++)
//            {
//                temp=temp.next;
//            }
//            t.next=temp.next;
//            temp.next=t;
//        }
//        size++;
//    }
//    void deleteAt(int idx){
//        Node temp=head;
//        for (int i=1;i<=idx-1;i++)
//        {
//            temp=temp.next;
//        }
//        temp.next=temp.next.next;
//        size--;
//    }
//    int  getValueOf(int idx )
//    {
//        Node temp=head;
//        for (int i=1;i<=idx;i++)
//        {
//            temp=temp.next;
//        }
//        return temp.data;
//    }
//    void display(){
//        Node temp=head;
//        while(temp!=null)
//        {
//            System.out.print(temp.data + " ");
//            temp=temp.next;
//        }
//        System.out.println();
//
//    }
//
//}
//public static void main(String[] args) {
//    Linkedlist ll=new Linkedlist();
//    ll.insertAtHead(8);
//    ll.insertAtEnd(3);
//    ll.insertAtEnd(5);
//    ll.insertAtEnd(22);
//    ll.insertAtEnd(13);
//    ll.insertAtEnd(55);
//
//    ll.insertAtHead(76);
//    ll.insertAt(2,99);
//    ll.display();
//
//    System.out.println(ll.size);
//    System.out.println(ll.getValueOf(3));
//    ll.deleteAt(3);
//    ll.display();
//    System.out.println(ll.size);
//
//}
