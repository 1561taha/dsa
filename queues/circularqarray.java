package queues;

public class circularqarray {
    public static class CQA{
        int f=-1;
        int r=-1;
        int size=0;
        int [] arr=new int[5];
        void add(int val) throws Exception
        {
            if (size== arr.length)
            {
                throw new Exception("Queue is full!");

            }
            else if (size==0){
                f=r=0;
                arr[0]=val;
            }
            else if (r==arr.length-1)
            {
                r=0;
                arr[0]=val;
            }
            else {
                arr[++r]=val;
            }
            size++;
        }
        int remove () throws Exception{
            if (size==0)
            {
                throw new Exception("Queue is empty!");
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
        int peek() throws Exception{
            if (size==0)
            {
                throw new Exception("Queue is empty!");
            }
            else {
                return arr[f];
            }

        }
        void display (){
            if (size==0){
                System.out.println("Queue is empty");
                return;
            }
            else if (r<f)
            {
                for (int i=f;i<arr.length;i++)
                {
                    System.out.print(arr[i]+ " ");
                }
                for (int i=0;i<=r;i++)
                {
                    System.out.print(arr[i]);
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
        boolean IsEmpty(){
            if (size==0) return true;
            else return false;
        }
    }
    public static void main(String[] args) throws Exception{

        CQA q= new CQA();
        System.out.println(q.IsEmpty());
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.display();
        q.remove();
        q.display();
        q.add(4);
        q.add(5);
        q.display();
        q.add(6);
q.display();
        for (int i=0;i<q.arr.length;i++)
        {
            System.out.print(q.arr[i]+ " ");
        }
//        q.add(7);

    }
}
