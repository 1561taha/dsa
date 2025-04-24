package slidingandtwoo;

import java.util.HashMap;

public class cardpoints {

    public int maxScore(int[] arr, int k) {

        int n=arr.length;

        int l=0;
        int r=n-1;
        int sum=0;
        int maxsum=0;
        for (int i=0;i<k;i++){
            sum+=arr[i];
            l++;
        }
        maxsum=sum;

        for (int i=0;i<k;i++){
            sum-=arr[l];
            sum+=arr[r];
            maxsum=Math.max(sum,maxsum);
            l--;
            r--;
        }
        return maxsum;

    }

    public int lengthOfLongestSubstring(String s) {

        int l=0;
        int r=0;
        int len=0;
        int maxl=0;
        HashMap<Character,Integer> mp= new HashMap<>();

        while(r<s.length()){
            char ch=s.charAt(r);
            if (mp.containsKey(ch)){
                int left=mp.get(l);
                l=Math.max(l,mp.get(r)+1);

            }
            mp.put(ch,r);
            len=r-l+1;
            maxl= Math.max(len,maxl);
        }
        return maxl;

    }
}
