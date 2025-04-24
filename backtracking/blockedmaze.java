package backtracking;

import java.util.Scanner;

public class blockedmaze {
//    public static void mazepath (int str, int stc,int endr,int endc, boolean [][]check,int[][] arr,String ans){
//        if (str>endr || stc>endc) return ;
//        if (str<0 || stc<0) return;
//        if (stc==endc && str==endr){
//            System.out.println(ans);
//            return;
//        }
//        if(arr[str][stc]==0)return;
//        if (check[str][stc]==true) return;
//
//        check[str][stc]=true;
//        mazepath(str+1,stc,endr,endc,check,arr,ans+'D');
//        mazepath(str,stc+1,endr,endc,check,arr,ans+'R');
//        mazepath(str-1,stc,endr,endc,check,arr,ans+'U');
//        mazepath(str,stc-1,endr,endc,check,arr,ans+'L');
//        check[str][stc]=false;
//
//    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][] arr={{1,1,0,1},
                      {1,0,1,1},
                      {1,1,1,1},
                      {1,1,0,1}};

        int m=arr.length;
        int n=arr[0].length;

        boolean [][] check= new boolean[m][n];
        mazepath(0,0,m-1,n-1,check,arr,"");
    }

    private static void mazepath(int sr, int sc, int endr, int endc, boolean[][] check, int[][] arr, String ans) {
     if(sr>endr || sc>endc || sc<0 || sr<0)  return;
     if (arr[sr][sc]==0)return;
     if(sc==endc && sr==endr ){
         System.out.println(ans);
         return;
     }
      if (check[sr][sc]==true)return;
      check[sr][sc]=true;
        mazepath(sr+1,sc,endr,endc,check,arr,ans+'D');
        mazepath(sr,sc+1,endr,endc,check,arr,ans+'R');
        mazepath(sr-1,sc,endr,endc,check,arr,ans+'U');
        mazepath(sr,sc-1,endr,endc,check,arr,ans+'L');
        check[sr][sc]=false;

    }
}
