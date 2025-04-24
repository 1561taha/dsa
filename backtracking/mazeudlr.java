package backtracking;

import java.util.Scanner;

public class mazeudlr {
//    public static void mazepath (int str, int stc,int endr,int endc, boolean [][]check,String ans){
//      if (str>endr || stc>endc) return ;
//      if (str<0 || stc<0) return;
//      if (stc==endc && str==endr){
//          System.out.println(ans);
//          return;
//      }
//      if (check[str][stc]==true) return;
//
//        check[str][stc]=true;
//        mazepath(str+1,stc,endr,endc,check,ans+'R');
//        mazepath(str,stc+1,endr,endc,check,ans+'D');
//        mazepath(str-1,stc,endr,endc,check,ans+'L');
//        mazepath(str,stc-1,endr,endc,check,ans+'U');
//        check[str][stc]=false;
//
//    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        boolean [][] check= new boolean[m][n];
        mazepath(0,0,m-1,n-1,check,"");
    }

    private static void mazepath(int sr, int sc, int endr, int endc, boolean[][] check, String ans) {
    if(sr>endr || sc>endc || sr<0 || sc<0) return;
    if (sr==endr && sc==endc){
        System.out.println(ans);
        return;
    }
        if (check[sr][sc]==true)return;
    check[sr][sc]=true;
    mazepath(sr+1,sc,endr,endc,check,ans+'D');
    mazepath(sr,sc+1,endr,endc,check,ans+'R');
    mazepath(sr-1,sc,endr,endc,check,ans+"U");
    mazepath(sr,sc-1,endr,endc,check,ans+'L');
    check[sr][sc]=false;

    }
}
