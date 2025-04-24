package hashmap;

import java.util.HashMap;

public class firdtunique {

    public int firstUniqChar(String s) {

        HashMap<Character,Integer> mp= new HashMap<>();

        int n=s.length();

        for (int i=0;i<n;i++){
            char ch=s.charAt(i);
            if (mp.containsKey(ch)){
                int freq=mp.get(ch);
                mp.put(ch,freq+1);
            }
            else mp.put(ch,1);
        }
        for (int i=0;i<n;i++){
            char ch=s.charAt(i);
            if (mp.get(ch)==1) return i;

        }
        return -1;
    }
}
