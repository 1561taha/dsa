package hashset;

import java.util.HashSet;

public class bagtable {
    public static void main(String[] args) {
        int [] arr= {2,1,1,3,2,3};
        int maxp=tablemax(arr);
        System.out.println(maxp);
    }

    private static int tablemax(int[] bag) {
//        HashSet<Integer> table= new HashSet<>();
//        int max=0;
//
//        for (int i=0;i<bag.length;i++){
//            if (!table.contains(bag[i])){
//                table.add(bag[i]);
//                max=Math.max(max,table.size());
//            }
//            else {
//                table.remove(bag[i]);
//
//            }
//
//
//        }
//        return max;
//    }

        HashSet<Integer> table = new HashSet<>();
        int max = 0;
        for (int i = 0; i < bag.length; i++) {
            if (table.contains(bag[i])) {
                table.remove(bag[i]);
            } else {
                table.add(bag[i]);
                max = Math.max(max, table.size());
            }
        }
        return max;
    }
}
