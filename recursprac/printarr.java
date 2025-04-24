package recursprac;

public class printarr {
    public static void print(int[] arr,int idx)
    {
        if (idx==arr.length)
        {
            return;
        }
        System.out.println(arr[idx]);
        print(arr,idx+1);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        print(arr,0);

    }
}
