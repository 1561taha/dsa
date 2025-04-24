package sorting;

import java.util.ArrayList;
import java.util.Collections;

public class bucket {
    public static void printarr(int  []arr, int idx)
    {
        if (idx==arr.length) {

            return;
        }
        System.out.print(arr[idx]+ " ");
        printarr(arr,idx+1);
    }
    public static int fmax(int[]arr,int n)
    {
        int max=Integer.MIN_VALUE;
        for (int i=0;i<n;i++)
        {
            if (arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
//    public static void bsort(float []arr) {
//        int n = arr.length;
//        ArrayList<Float>[] bucket = new ArrayList[n];
//        for (int i = 0; i < n; i++) {
//            bucket[i] = new ArrayList<>();
//        }
//
//        for (int i = 0; i < n; i++) {
//            int bidx = (int) arr[i] * n;
//            bucket[bidx].add(arr[i]);
//        }
//        for (int i=0;i<bucket.length;i++){
//            Collections.sort(bucket[i]);
//        }
//        int index=0;
//        for (int i=0;i<bucket.length;i++) {
//            ArrayList<Float> currb = bucket[i];
//
//            for (int j = 0; j < currb.size(); j++) {
//                arr[index++] = currb.get(j);
//            }
//        }
//
//    }
    public static  void bsort(int  [] arr, int n)
    { int max=fmax(arr,n);

        ArrayList<Integer>[] buckets = new ArrayList[(max / n) + (max % n == 0 ? 0 : 1)];

        for (int i=0;i<max/n;i++) {
            buckets[i] = new ArrayList<>();
        }
            for (int j = 0; j < buckets.length; j++) {
                int bidx = (arr[j] * (buckets.length - 1)) / max;

                buckets[bidx].add(arr[j]);
            }
             int index=0;
            for (int i=0;i<buckets.length;i++)
            {
                Collections.sort(buckets[i]);
            }

            for (int i=0;i<buckets.length;i++)
            {
                ArrayList<Integer> currb=buckets[i];
                for (int j=0;j<currb.size();j++)
                {
                    arr[index++]=currb.get(j);
                }

            }

    }
//    import java.util.ArrayList;
//import java.util.Collections;
//
//    public class BucketSort {
//        public static void main(String[] args) {
//            int[] arr = {5, 12, 3, 8, 15, 7, 20, 14, 1, 25}; // Example input array
//            bucketSort(arr);
//            System.out.println("Sorted array: ");
//            for (int num : arr) {
//                System.out.print(num + " ");
//            }
//        }
//
//        public static void bucketSort(int[] arr) {
//            int n = arr.length;
//            int max = 25; // Maximum value in the range
//
//            // Create buckets
//            ArrayList<Integer>[] buckets = new ArrayList[max];
//            for (int i = 0; i < max; i++) {
//                buckets[i] = new ArrayList<>();
//            }
//
//            // Distribute elements into buckets
//            for (int num : arr) {
//                int bidx = (num - 1) * max / max;
//                buckets[bidx].add(num);
//            }
//
//            // Sort individual buckets
//            for (int i = 0; i < max; i++) {
//                Collections.sort(buckets[i]);
//            }
//
//            // Concatenate buckets back into original array
//            int index = 0;
//            for (int i = 0; i < max; i++) {
//                for (int num : buckets[i]) {
//                    arr[index++] = num;
//                }
//            }
//        }
//    }

    public static void main(String[] args) {
        int  [] arr={2,3,23,11,16,12,7,9,24};
        bsort(arr,arr.length);
        printarr(arr,0);



    }
}
