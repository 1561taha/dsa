package sorting;

import java.util.Scanner;

public class lexselection {
    public static  String [] createarr(int n, Scanner sc)
    {
        String [] arr= new String[n];
        System.out.println("enter "+n+" strings");

        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextLine();
        }

        return arr;

    }
    public static void printarr(String []arr, int idx)
    {
        if (idx==arr.length)
        {

            return;
        }
        System.out.print(arr[idx]+ " ");
        printarr(arr,idx+1);
    }
    public static  void lex(String[] s, int n)
    {
        for (int i=0;i<n-1;i++)
        {
            int min=i;
            for (int j=i+1;j<n;j++)
            {
                if (s[min].compareTo(s[j])>0)
                {
                    min=j;
                }
            }
            String temp=s[i];
            s[i]=s[min];
            s[min]=temp;
        }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        String [] s=createarr(n,sc);
        lex(s,n);

        printarr(s,0);


    }
}
