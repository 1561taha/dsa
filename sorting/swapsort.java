package sorting;

public class swapsort
{
    public static void swsort(int [] arr, int n){
       int x=-1;
       int y=-1;
       if (n<=1) return;
        for (int i=1;i<n;i++)
        {
            if (arr[i]<arr[i-1])
            {
                if (x==-1)
                {
                    x=i-1;
                    y=i;
                }
                else {
                    y=i;
                }
            }

        }
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;

}
    public static void printarr(int[]arr, int idx)
    {
        if (idx==arr.length) {

            return;
        }
        System.out.print(arr[idx]+ " ");
        printarr(arr,idx+1);
    }
    public static void main(String[] args) {
        int []arr={3,8,6,7,5,9,10};
        swsort(arr,arr.length);
        printarr(arr,0);

    }
}
