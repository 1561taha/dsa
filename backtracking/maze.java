package backtracking;

import java.util.Scanner;

public class maze {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter ending points");
        int m=sc.nextInt();
        int n=sc.nextInt();
        mazepath(0,0,m-1,n-1, "");
    }

    private static void mazepath(int sr, int sc, int endr, int endc, String ans) {
        if(sr>endr|| sc>endc) return;
        if(sr==endr && sc==endc){
            System.out.println(ans);
            return;
        }
        mazepath(sr+1,sc,endr,endc,ans+'D');
        mazepath(sr,sc+1,endr,endc,ans+'R');
    }

//    private static void mazepath(int s1, int s2,int s1end, int s2end,String ans) {
//       if(s1>s1end)return;
//       if(s2>s2end) return ;
//       if (s1==s1end && s2==s2end){
//           System.out.println(ans);
//           return;
//       }

//        mazepath(s1+1,s2,s1end,s2end,ans+'R');
//        mazepath(s1,s2+1,s1end,s2end,ans+'D');
//    }
}
