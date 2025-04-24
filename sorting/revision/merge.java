package sorting.revision;

public class merge {
    public static void printarr(int [] arr){
        for (int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void mergefn(int []a ,int []b ,int []c){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if (a[i]<=b[j]) c[k++]=a[i++];
            else c[k++]=b[j++];
        }
        while (i<a.length) c[k++]=a[i++];
        while(j<b.length)c[k++]=b[j++];
    }
    public static void mergesort(int []arr){
        int n = arr.length;
        if (n==1) return;
        int [] l= new int [n/2];
        int [] r= new int [n-n/2];

        for (int i=0;i<n/2;i++){
            l[i]=arr[i];
        }

        for (int i=0;i<n-n/2;i++){
            r[i]=arr[i+n/2];
        }

        mergesort(l);
        mergesort(r);
        mergefn(l,r,arr);

    }

    public static void main(String[] args) {
        int [] arr= {5,4,3,2,1};
        printarr(arr);

        mergesort(arr);
        printarr(arr);
    }
}
