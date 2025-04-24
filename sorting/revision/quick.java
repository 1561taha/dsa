package sorting.revision;

public class quick {
    public static void printarr(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static int partition(int st, int end, int[] arr) {
        int pivot = arr[st];
        int sc = 0;
        // 1. Count elements ≤ pivot in the subarray [st+1…end]
        for (int i = st + 1; i <= end; i++) {
            if (arr[i] <= pivot) {
                sc++;
            }
        }
        // 2. Compute pivot’s final index and swap it into place
        int cidx = st + sc;
        swap(arr, st, cidx);

        // 3. Re-partition the remaining elements around the pivot
        int i = st, j = end;
        while (i < cidx && j > cidx) {
            while (i < cidx && arr[i] <= pivot) {
                i++;
            }
            while (j > cidx && arr[j] > pivot) {
                j--;
            }
            if (i < cidx && j > cidx) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return cidx;
    }

    public static void quicks(int st, int end, int[] arr) {
        if (st >= end) return;
        int idx = partition(st, end, arr);
        quicks(st, idx - 1, arr);
        quicks(idx + 1, end, arr);
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        printarr(arr);
        quicks(0, arr.length - 1, arr);
        printarr(arr);
    }
}
