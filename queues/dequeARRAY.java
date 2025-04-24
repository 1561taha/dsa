package queues;

public class dequeARRAY {
    public static class DeqArr{
        int f=-1;
        int r=-1;
        int [] arr=new int[5];
        int size=0;

        void addAtEnd(int x)throws Exception{
            if (f==-1){
                f=r=0;
                arr[0]= x;
            }
            else if (size==arr.length){
                throw new Exception("queue is full");

            }
            else if (r==arr.length-1){
                r=0;
                arr[0]=x;
            }
            else
            {
                arr[++r]=x;

            }
            size++;
        }
        void addAtSt(int x)throws Exception{
            if (size==arr.length)
            {
                throw new Exception("queue is full");
            }
           else if (f==-1){
                f=r=0;
                arr[0]= x;
            }
          else  if (f==0)
            {
                f=arr.length-1;
                arr[f]=x;

            }
            else {
                arr[--f]=x;
            }
            size++;
        }
        int removeatst()throws Exception{
            if (size==0){
                throw new Exception("queueu is empty");
            }
            else if (f==arr.length-1){
                int x=arr[f];
                f=0;
                size--;
                return x;
            }
            else {
                int x=arr[f];
                f++;
                size--;
                return x;
            }

        }
        int removeatlast() throws Exception{
            if (size==0){
                throw new Exception("queueu is empty");
            }
            else if (r==0){
                int x=arr[r];
                r=arr.length-1;
                size--;
                return x;
            }
            else {
                int x=arr[r];
                r--;
                size--;
                return x;
            }


        }
        int peekatst()throws Exception{
            if (size==0){
                throw new Exception("queue is empty");
            }
            else return arr[f];

        }
        int peekatlast()throws Exception{
            if (size==0){
                throw new Exception("queue is empty");
            }
            else return arr[r];

        }
        void display(){
            if (size==0){
                System.out.println(" queue is empty");
                return;
            }
            else if (r<f){
                for (int i=f;i<arr.length;i++)
                {
                    System.out.print(arr[i]+ " ");
                }
                for (int i=0;i<=r;i++)
                {
                    System.out.print(arr[i]+ " ");
                }
                System.out.println();
            }
            else {
                for (int i=f;i<=r;i++)
                {
                    System.out.print(arr[i]+ " ");
                }
                System.out.println();
            }

        }

    }
    public static void main(String[] args) throws Exception{

        DeqArr q= new DeqArr();
        q.addAtSt(1);

        q.addAtEnd(3);
        q.addAtEnd(4);
        q.addAtEnd(5);
        q.display();
        q.addAtSt(2);
        q.display();
        q.removeatst();
        q.display();
        q.removeatlast();
        q.display();
        System.out.println(q.peekatlast());
        System.out.println(q.peekatst());

    }
}
