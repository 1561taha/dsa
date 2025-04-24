package backtracking;

public class blockedmazeoptimizesd {
    public static void main(String[] args) {
        int[][] maze = {{1, 1, 0, 1},
                        {1, 0, 1, 1},
                        {1, 1, 1, 1},
                        {1, 1, 0, 1}};

        int m = maze.length;
        int n = maze[0].length;

        mazepathop(0, 0, m - 1, n - 1, maze, "");

    }

    private static void mazepathop(int sr, int sc, int endr, int endc, int[][] maze, String ans) {

        if (sr >endr || sc > endc || sr < 0 || sc < 0) return;

        if (sr == endr && sc == endc) {
            System.out.println(ans);
            return;
        }
        if (maze[sr][sc] == 0) return;
        if (maze[sr][sc] == -1) return;
        maze[sr][sc] = -1;

        mazepathop(sr + 1, sc, endr, endc, maze, ans + 'D');
        mazepathop(sr, sc + 1, endr, endc, maze, ans + 'R');
        mazepathop(sr - 1, sc, endr, endc, maze, ans + 'U');
        mazepathop(sr, sc - 1, endr, endc, maze, ans + 'L');
        maze[sr][sc] = 1;
    }
}

//    private static void mazepathop(int str, int stc, int endr, int endc, int[][] maze,String ans) {
//        if (stc>endc|| str >endr) return;
//        if (str<0 || stc<0) return;
//        if (str==endr && stc==endc){
//            System.out.println(ans);
//            return;
//        }
//      if (maze[str][stc]==0)return;
//        if(maze[str][stc]==-1) return;
//        maze[str][stc]=-1;
//        mazepathop(str+1,stc,endr,endc,maze, ans+'D');
//        mazepathop(str,stc+1,endr,endc,maze,ans+'R');
//        mazepathop(str-1,stc,endr,endc,maze,ans+'U');
//        mazepathop(str,stc-1,endr,endc,maze,ans+'L');
//        maze[str][stc]=1;
//    }

