package arrays;

public class maxval {
    public static void main(String[] args) {
        int[] arr=new int[6];
        arr =new int[] {3,5,6,8,43,67};


        int max=arr[0];
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]> max) {
                max = arr[i];
                break;
            }
        }
        System.out.println(max);


    }
}
