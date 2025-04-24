package sorting.revision;

import java.util.Scanner;

public class inserton {
    public static int [] createarr(Scanner sc, int n){
        int [] arr= new int[n];
        System.out.println(" enter"+ n + " elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static void printarr(int [] arr){
        for (int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void swap (int []arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
//    public static void insort(int []arr, int n){
//        for (int i=1;i<n;i++){
//            int j=i;
//            while (j>0 && arr[j]<arr[j-1] ){
//                swap(arr,j,j-1);
//                j--;
//            }
//
//        }
//    }

    public static  void insort(int []arr, int n){
        for (int i=1;i<n;i++){
            int j=i;
            while (j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int [] arr= createarr(sc,n);
        printarr(arr);
        insort(arr, n);
        printarr(arr);

    }
}
