package sorting.revision;

import java.util.Scanner;

public class bubble {
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
//    public static void bsort(int []arr, int n){
//        for (int i=0;i<n-1;i++){
//            boolean flag=true;
//            for(int j=0;j<n-1-i;j++){ //optimization1 by adding -1
//                if (arr[j]>arr[j+1]){
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                    flag=false;
//                }
//
//            }
//            if (flag==true) return;
//        }
//    }

    public static  void bsort(int []arr, int n){
        for (int i=0;i<n-1;i++){
            boolean flag=true;
            for (int j=0;j<n-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=false;
                }

            }
            if (flag==true) break;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of array");
        int n= sc.nextInt();
        int []arr=createarr(sc, n);
        printarr(arr);
        bsort(arr,n);
        printarr(arr);



    }
}
