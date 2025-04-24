package heaps;

public class meanheapimp {
    public static class minheap{
        private int []arr;
       private int size;
       minheap(int length){
           arr= new int[length];
           size=0;
       }
//       public int remove()throws Exception{
//           if(size==0) throw new Exception("heap is empty");
//           int peek=arr[0];
//           swap(0,size-1);
//           size--;
//           downheapify(0);
//           return peek;
//       }
//       private void downheapify(int idx){
//           if(idx>=size-1) return;
//
//           int minidx=idx;
//           int lc=2*idx+1;
//           int rc=2*idx+2;
//           if(lc<size && arr[lc]<arr[minidx]) minidx=lc;
//           if(rc<size && arr[rc]<arr[minidx]) minidx=rc;
//           if(idx==minidx) return;
//           swap(idx,minidx);
//           downheapify(minidx);
//
//       }
        public int remove()throws Exception{
           if(size==0) throw new Exception("heap is empty");
           int peek=arr[0];
           swap(0,size-1);
           size--;
           downheapify(0);
           return  peek;
        }
        private void downheapify(int idx){
           if (idx>=size-1) return;
           int lc=2*idx+1;
           int rc=2*idx+2;
           int minidx=idx;
           if(lc<size && arr[lc]<arr[minidx])minidx=lc;
           if(rc<size && arr[rc]<arr[minidx])minidx=rc;
           if(idx==minidx)return;
           swap(idx,minidx);
           downheapify(minidx);
        }
       public void add(int x)throws Exception{
           if(size==arr.length) throw new Exception("heap is full");
           arr[size++]=x;
           upheapify(size-1);
       }
       public int peek()throws Exception{
           if(size==0) throw new Exception("heap is empty");
           return arr[0];
       }

       public void upheapify(int idx){
           if (idx==0) return;
           int parent=(idx-1)/2;
           if (arr[parent]>=arr[idx]){
               swap(idx,parent);
           }
           upheapify(parent);
       }
       public void swap (int i, int j){
           int temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;

       }
       public int size (){
           return size;
       }

    }
    public static void main (String[] args)throws Exception {
        minheap pq= new minheap(10);
        pq.add(6);
        pq.add(3);
        pq.add(-2);
        pq.add(-6);
        System.out.println(pq.size());

        System.out.println(pq.peek());
        pq.remove();
        System.out.println(pq.peek()+" "+ pq.size());
    }
}
