package arrays;

public class sumofarray {
    public static void main(String[] args) {
        int arr[]=new int[5];
        arr= new int[]{2, 3, 5, 7,1};
        int sum=0;
        for (int i=0;i<5;i++)
        {
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
