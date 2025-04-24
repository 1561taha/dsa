package arrays;


import java.util.Scanner;

public class lastocc {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        System.out.println("enter elemnts of array");
        int arr[]=new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }
        System.out.println("enter x");
        int x=sc.nextInt();
        int f=-1;
        for (int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        for (int i=0;i<n;i++)
        {
            if (arr[i]==x)
            {
                f=i;
            }
        }
        System.out.println("sound x"+f);

    }
}
