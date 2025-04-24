package binarytree;

import java.util.*;

public class implementation {
    static int z=0;
    public static class pair {
        Node n;
        int num;

        pair(Node n, int num){
            this.n=n;
            this.num=num;
        }
    }
    public static  class Node {
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val=val;
        }
        void display(Node root){
            if(root==null)return;
            System.out.print(root.val+ " ");
            display(root.left);

            display(root.right);

        }


    }
    public static void main(String[] args) {

        Node a=new Node(1);
        Node b= new Node(2);
        Node c= new Node(3);
        Node d=new Node(4);
        Node e= new Node(5);
        Node f= new Node(6);
        a.left=b;
        a.right=c;
        b.left=d;
        c.right=e;
        d.left=f;

        display(a);
        System.out.println();
        a.display(a);
        System.out.println();
        int s= sum(a);
        System.out.println(s);

        int p =pro(a);
        System.out.println(p);

        int mx=maxval(a);
        System.out.println(mx);
        int sz=size(a);
        System.out.println(sz);
        int lvl= level(a);
        System.out.println(lvl);

        lot(a);
        System.out.println();

        for (int x=0;x<4;x++){
            bfs(a,0,x);
            System.out.println();
        }

        List<List<Integer>> ans= getTreeTraversal(a);

//        for (int i=0;i<ans.size();i++){
//            for (int j=0;j<ans.get(0).size();j++){
//                System.out.print(ans.get(i).get(j));
//            }
//            System.out.println();
//        }

        System.out.println(ans);

    }

    public static List<List<Integer>> getTreeTraversal(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> pre = new ArrayList<>();
        List<Integer> post = new ArrayList<>();



        if (root == null) return ans;

        Stack<pair> st = new Stack<>();
        st.push(new pair(root, 1));

        while (!st.isEmpty()) {
            pair top = st.pop();

            if (top.num == 1) {
                pre.add(top.n.val);
                top.num++;
                st.push(top);

                if (top.n.left != null) {
                    st.push(new pair(top.n.left, 1));
                }
            } else if (top.num == 2) {
                in.add(top.n.val);
                top.num++;
                st.push(top);

                if (top.n.right != null) {
                    st.push(new pair(top.n.right, 1));
                }
            } else {
                post.add(top.n.val);
            }
        }

        ans.add(in);
        ans.add(pre);
        ans.add(post);
        return ans;
    }

    private static void bfs(Node root,int lv,int level) {
       if(root==null) return;
        if (lv==level){
           System.out.print(root.val+ " ");
       }
        bfs(root.left,lv+1,level);
        bfs(root.right,lv+1,level);
    }

    private static void lot(Node root) {
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        while (q.size()>0){
            Node temp=q.remove();
            System.out.print(temp.val+ " ");
        if (temp.left!=null)q.add(temp.left);
          if(temp.right!=null)  q.add(temp.right);
        }

    }

    private static int level(Node root) {
        if (root==null) return 0;
        return 1+Math.max(level(root.left),level(root.right));
    }

    private static int size(Node root) {
        if (root==null)return 0;

        return 1+size(root.left)+size(root.right);
    }

    private static int maxval(Node root) {
        if (root==null)return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(maxval(root.left),maxval(root.right)));
    }

    private static int pro(Node root) {
        if (root==null)return 1;
        return root.val*pro(root.left)* pro(root.right);
    }

    private static int sum(Node root) {
        if (root==null)return 0;

        return root.val+sum(root.left)+sum(root.right);
    }

    private static void display(Node root) {
        if (root==null)return ;
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }
}
