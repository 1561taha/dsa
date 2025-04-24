package heaps;

public class maxheapimp {
    public static class maxheap{
      private  int []arr;
        private int size;
        maxheap (int length){
            arr= new int [length];
            size=0;
        }
        public int remove(){
            int peek=arr[0];
            swap(0,size-1);
            size--;
            downheapify(0);
            return peek;
        }
        private void downheapify(int idx){
            if(idx>=size-1) return;
            int lc=2*idx+1;
            int rc=2*idx+2;
            int minidx=idx;
            if(lc<size && arr[lc]>arr[minidx])minidx=lc;
            if(lc<size && arr[rc]>arr[minidx])minidx=rc;
            if(idx==minidx) return;
            swap(idx ,minidx);
            downheapify(minidx);
        }
        public int peek ()throws Exception{
            if(size==0) throw new Exception("heap is empty");
            return arr[0];
        }
        public void add(int x)throws Exception{
            if(size==arr.length)throw new Exception("heap is full");
            arr[size++]=x;
            upheapify(size-1);
        }
        private void upheapify(int idx){
            if(idx==0) return;
            int parent=(idx-1)/2;
            if(arr[parent]<=arr[idx]){
                swap(idx,parent);
            }
            upheapify(parent);
        }
        private void swap (int i,int j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

    }
    public static void main(String[] args)throws Exception {
        maxheap h=new maxheap(10);
        h.add(5);
        h.add(10);
        h.add(3);
        h.add(15);
        System.out.println(h.peek()+ " "+ h.size);
        h.remove();
        System.out.println(h.peek()+ " "+ h.size);
        h.add(100);
        System.out.println(h.peek()+ " "+ h.size);



    }
}
