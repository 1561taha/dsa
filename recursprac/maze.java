package recursprac;

import java.util.Scanner;

public class maze {
    public static  int ways(int a , int b){
        if (a==1 || b==1) return 1;

        return ways(a-1,b)+ ways(a,b-1);
    }
//    public static  int ways(int a , int b){
//        if (a==1 || b==1) return 1;
//        int downways=ways(a-1,b);
//        int rightways=ways(a,b-1);
//        return downways+rightways;
//    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int w=ways(m,n);
        System.out.println(w);
    }
}
