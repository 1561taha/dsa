package hashmap;

import java.util.HashMap;

public class anagram {
    public static HashMap<Character, Integer> createhmp(String str){
        HashMap<Character, Integer> mp= new HashMap<>();
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (!mp.containsKey(ch)){
                mp.put(ch,1);
            }
            else {
                int currfreq=mp.get(ch);
                mp.put(ch,currfreq+1);
            }
        }
        return mp;
    }
    public static boolean anagram (String s , String t){
        HashMap<Character,Integer> mp1=createhmp(s);
        HashMap<Character, Integer> mp2= createhmp(t);

        return mp1.equals(mp2);

    }
    public static void main(String[] args) {

    }
}
