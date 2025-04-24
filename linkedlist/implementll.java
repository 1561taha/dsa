package linkedlist;

public class implementll {
    public static class Node {
        int data;
        Node next;

        Node (int data){
            this.data=data;
        }
        public static class Linkedlist{
            Node head=null;
            Node tail=null;
            int size =0;

            public void addAtEnd(int val){
                Node temp=new Node(val);
                if (head==null)
                {
                    head=tail=temp;
                }
                else {
                    tail.next=temp;
                    tail=temp;

                }
                size++;
            }
            void addAtHead(int val)
            {
                if (head==null)
                {
                    addAtEnd(val);
                    return;
                }
                else {
                    Node temp=new Node(val);
                    temp.next=head;
                    head=temp;
                }
                size++;
            }
            void addAt(int idx, int el)
            {
                if (idx==0)
                {
                    addAtHead(el);
                    return;
                } else if (idx==size) {
                    addAtEnd(el);
                    return;
                }
                else {
                    Node temp=head;
                    Node t=new Node(el);
                    for (int i=1;i<=idx-1;i++)
                    {
                        temp=temp.next;
                    }
                    t.next=temp.next;
                    temp.next=t;
                }
                size++;
            }
            void deleteAt(int idx)
            {
                Node temp=head;
                if (idx==0)
                {
                    head=temp.next;
                    size--;
                    return;
                }
                for (int i=1;i<=idx-1;i++)
                {
                    temp=temp.next;
                }
                temp.next=temp.next.next;
                if(idx==size-1)
                    tail=temp;
                size--;
            }
            public void  display(){
                Node temp=head;
                while (temp!=null)
                {
                    System.out.print(temp.data + " ");
                    temp=temp.next;
                }
                System.out.println();
            }


        }

        public static void main(String[] args) {
            Linkedlist ll=new Linkedlist();
            ll.addAtHead(33);
            ll.addAtEnd(3);
            ll.addAtEnd(1);
            ll.addAtEnd(7);

            ll.addAtHead(22);
            ll.display();
            ll.addAt(0,34);
            ll.addAt(3,5);
            ll.display();
            System.out.println(ll.size);
            ll.addAt(7,67);
            ll.display();
            System.out.println(ll.size);
            ll.deleteAt(7);
            ll.display();
            System.out.println(ll.size);
            System.out.println(ll.tail.data);
            ll.deleteAt(0);
            ll.display();
            System.out.println(ll.head.data);

        }
    }


}
