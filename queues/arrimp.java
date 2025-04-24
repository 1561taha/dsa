package queues;

public class arrimp {
    public  static class QueueArr{

        int [] arr= new int[50];
        int size;
        int f=-1;
        int r=-1;

        void add(int val){
            if (r==arr.length-1)
            {
                System.out.println("queue is full");
            }
            if (f==-1) {
                f = r = 0;
                arr[0]=val;
            }
            else {
                arr[++r]=val;

            }
            size++;

        }

        int remove(){
            if (arr.length==0)
            {
                System.out.println("queue is empty");
                return -1;
            }
           else {
                int x = arr[f];
                f++;
                size--;
                return x;

            }

        }
        int peek (){
            if (arr.length==0)
            {
                System.out.println("queue is empty");
                return -1;
            }

            else {
                return arr[f];
            }

        }
        void display(){
            for (int i=f;i<=r;i++)
            {
                System.out.print(arr[i]+ " ");
            }
            System.out.println();
        }

        boolean IsEmpty(){
            if (size==0) return true;
            else return false;
        }


    }
    public static void main(String[] args) {
        QueueArr q= new QueueArr();
        System.out.println(q.IsEmpty());

        q.add(1);
        q.add(2);
        q.add(3);
        q.display();
        System.out.println(q.size);
        q.remove();
        q.display();
        System.out.println(q.size);
        System.out.println(q.peek());
        System.out.println(q.IsEmpty());


    }
}
