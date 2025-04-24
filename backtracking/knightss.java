package backtracking;

import java.util.Scanner;

public class knightss {
    static int number=5;
    static int maxknight=-1;
//    public static boolean possible(char [][] board, int row , int col){
//        int n= board.length;
//        int i=row,j=col;
//
//        i=row-2;
//        j=col+1;
//        if(i>=0 && j<n && board[i][j]=='K')return false;
//
//        i=row-2;
//        j=col-1;
//        if(i>=0 && j>=0 && board[i][j]=='K')return false;
//
//        i=row+2;
//        j=col-1;
//        if(i<n&& j>=0 && board[i][j]=='K')return false;
//
//        i=row+2;
//        j=col+1;
//        if(i<n && j<n && board[i][j]=='K')return false;
//
//        i=row+1;
//        j=col+2;
//        if(i<n && j<n && board[i][j]=='K')return false;
//
//        i=row-1;
//        j=col+2;
//        if(i>=0 && j<n && board[i][j]=='K')return false;
//
//        i=row-1;
//        j=col-2;
//        if(i>=0&& j>=0 && board[i][j]=='K')return false;
//
//        i=row+1;
//        j=col-2;
//        if(i<n && j>=0 && board[i][j]=='K')return false;
//
//        return true;
//    }
//    public static void helper(char [][] board, int row, int col, int num){
//        int n= board.length;
//        if(row==n)
////            if(num==number)
//        {
//            for (int i=0;i<n;i++)
//            {
//                for (int j=0;j<n;j++){
//                    System.out.print(board[i][j]);
//                }
//                System.out.println();
//            }
//            System.out.println();
//            maxknight=Math.max(maxknight,num);
//            return;
//        }
//      else  if (possible(board,row,col))
//      {
//            board[row][col]='K';
//            if(col!=n-1)helper(board,row,col+1,num+1);
//            else helper(board,row+1,0,num+1);
//            board[row][col]='X';
//        }
//            if (col != n - 1) helper(board, row, col + 1, num);
//            else helper(board, row + 1, 0, num);
//
//    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        char [][] board= new char[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                board[i][j]='X';
            }
        }
        helper(board,0,0,0);
        System.out.println(maxknight);
    }

    private static void helper(char[][] board, int row, int col, int num) {
        int n= board.length;

        if(row==n){
            if (num==number) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(board[i][j]);
                    }
                    System.out.println();
                }

                System.out.println();
            }
                maxknight = Math.max(maxknight, num);
                return;

        }
       if (possible(board, row, col)){
           board[row][col]='K';
           if (col!=n-1) helper(board,row,col+1,num+1);
           else helper(board,row+1,0,num+1);
           board[row][col]='X';
       }

        if (col!=n-1) helper(board,row,col+1,num);
        else helper(board,row+1,0,num);

    }

    private static boolean possible(char[][] board, int row, int col) {
        int n=board.length;
        int i=row, j=col;

        i=row-2;
        j=col+1;
        if(i>=0 && j<n && board[i][j]=='K')return false;

        i=row-2;
        j=col-1;
        if(i>=0 && j>=0 &&  board[i][j]=='K')return false;

        i=row+2;
        j=col+1;
        if(i<n && j<n && board[i][j]=='K')return false;

        i=row+2;
        j=col-1;
        if(i<n && j>=0 && board[i][j]=='K')return false;

        i=row-1;
        j=col+2;
        if(i>=0 && j<n && board[i][j]=='K')return false;

        i=row+1;
        j=col+2;
        if(i<n && j<n && board[i][j]=='K')return false;

        i=row-1;
        j=col-2;
        if(i>=0 && j>=0 && board[i][j]=='K')return false;

        i=row+1;
        j=col-2;
        if(i<n && j>=0 && board[i][j]=='K')return false;

        return true;
    }
}
