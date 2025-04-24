package arrays;

public class searchx {
    public static void main(String[] args) {
        int arr[]={2,5,3,7,1,5};
        int x=7;
        int find=-1;
        for (int i =0;i<arr.length;i++)
        {
           if (arr[i]==x)
               find=i;
        }
        if (find==-1)
        {
            System.out.println("not found");
        }
        else {
            System.out.println("found"+x+"at"+find);
        }
    }
}
