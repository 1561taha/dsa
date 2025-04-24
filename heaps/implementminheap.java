package heaps;

public class implementminheap {
    public static class heapmin{
        private int [] arr;
        private int size;
        heapmin(int cap){
            arr= new int[cap];
            size=0;
        }
        private void downheapify(int idx){
            if(idx>=size-1)return;
            int lc=2*idx+1;
            int rc=2*idx+2;
            int mini=idx;
            if(lc<size && arr[lc]<arr[mini])mini=lc;
            if(rc<size && arr[rc]<arr[mini])mini=rc;
            if(mini==idx)return;
            swap(idx,mini);
            downheapify(mini);
        }
        public int remove(){
            int peek=arr[0];
            swap(0,size-1);
            downheapify(0);
            size--;
            return peek;
        }
        public void  add(int x){
            arr[size++]=x;
            upheapify(size-1);
        }
        private void upheapify(int idx){
            if (idx==0) return;
            int parent=(idx-1)/2;
            if(arr[parent]<arr[idx]) swap(parent,idx);
            upheapify(parent);
        }
        private void swap (int i, int j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }


    public static void main(String[] args) {

        heapmin h=new heapmin(10);
    }
}
