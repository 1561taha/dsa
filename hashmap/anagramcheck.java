package hashmap;

import java.util.HashMap;

public class anagramcheck {

    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()) return  false;
        HashMap<Character,Integer>mp= new HashMap<>();

        int n=s.length();

        for (int i=0;i<n;i++){
            char ch= s.charAt(i);
            if (mp.containsKey(ch)){
                int freq=mp.get(ch);
                mp.put(ch,freq+1);
            }
            else {
                mp.put(ch,1);
            }
        }

        for (int i=0;i<n;i++){
            char ch=t.charAt(i);
            if (mp.containsKey(ch)){
                int freq=mp.get(ch);

                if (freq==0)mp.remove(ch);
                else {
                    mp.put(ch,freq-1);
                }

            }
        }
        if (!mp.isEmpty()) return false;

        return true;

    }
}
