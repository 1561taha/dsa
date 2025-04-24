package array2d;


import java.util.Arrays;

public class test {
    public static void printarr(int arr[][],int n, int m)
    {
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][]arr=new int[5][4];
        Arrays.fill(arr[0],-1);
        printarr(arr,5,4);;
    }
}
