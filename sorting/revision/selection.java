package sorting.revision;

import java.util.Scanner;

public class selection {
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
//    public static void selsort(int[] arr, int n){
//        for (int i=0;i<n-1;i++){
//
//           int  min =Integer.MAX_VALUE;
//           int mini=i;
//            for (int j=i;j<n;j++){
//                if (arr[j]<min) {
//                    min=arr[j];
//                    mini=j;
//                }
//            }
//            int temp=arr[i];
//            arr[i]=arr[mini];
//            arr[mini]=temp;
//        }
//    }

    public static void selsort(int []arr, int n){
        for (int i=0;i<n-1;i++){
            int min=Integer.MAX_VALUE;
            int midx=-1;
            for (int j=i;j<n;j++){
               if(arr[j]<min){
                   min=arr[j];
                   midx=j;
               }
            }
            int temp=arr[i];
            arr[i]=arr[midx];
            arr[midx]=temp;

        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr= createarr(sc,n);
        printarr(arr);
        selsort(arr,n);
        printarr(arr);



    }
}
