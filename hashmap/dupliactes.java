package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class dupliactes {

    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> ans=new ArrayList<>();

        int n= nums.length;

        HashMap<Integer, Integer> mp= new HashMap<>();

        for (int i=0;i<n;i++){
            if(mp.containsKey(nums[i])){
                ans.add(nums[i]);
            }
            else {
                mp.put(nums[i],1);
            }

        }
        return ans;

    }
}
