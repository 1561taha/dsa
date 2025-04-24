package slidingandtwoo;

import java.util.HashMap;

public class lengthoflongestsubstring {



    public int lengthOfLongestSubstring(String s) {

        HashMap<Character,Integer> mp= new HashMap<>();

        int len=0;
        int maxl=0;
        int l=0;
        int r=0;
        while(r<s.length()){
            char ch=s.charAt(r);
            if (mp.containsKey(ch)){
                l=mp.get(ch)+1;

            }
            else {
                mp.put(ch,r);
            }
            len=r-l+1;
            maxl=Math.max(len,maxl);
            r++;
        }
        return maxl;


    }
}
