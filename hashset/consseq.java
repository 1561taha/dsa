package hashset;

import java.util.HashSet;

public class consseq {
    public  int  longestConsecutive(int[] nums){
        HashSet<Integer> st= new HashSet<>();
        for (int i=0;i<nums.length;i++){
            st.add(nums[i]);
        }
        int maxstr=0;

        for ( int num: st){
            if (!st.contains(num-1)){
                int currn=num;
                int streak=1;
                while (st.contains(currn+1)){
                    streak++;
                    currn++;
                }
                maxstr=Math.max(maxstr,streak);
            }

        }
        return maxstr;
    }
}
