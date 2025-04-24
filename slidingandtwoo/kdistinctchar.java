package slidingandtwoo;

import java.util.HashMap;

public class kdistinctchar {

    public static int kDistinctChars(int k, String str) {
        HashMap<Character,Integer> mp= new HashMap<>();

//        StringBuilder sb =  new StringBuilder(str);

        int l=0,r=0,len=0,maxl=0;

        while(r<str.length()){
             char ch=str.charAt(r);
             if (mp.containsKey(ch)){
                 int freq=mp.get(ch);
                 mp.put(ch,freq+1);
             }
             else {
                 mp.put(ch,r);
             }

             if (mp.size()>k){
                 char curr=str.charAt(l);
                 int freq=mp.get(l);
                 if (freq==1) mp.remove(curr);
                 else mp.put(curr,freq-1);
                 l++;
             }

             len=r-l+1;
             maxl=Math.max(len,maxl);
             r++;
        }
        return maxl;
    }

}
