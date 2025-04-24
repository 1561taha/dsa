package hashmap;

import java.util.*;

public class basic {
    public static void main(String[] args) {

        HashMap <String,Integer> mp= new HashMap<>();

        mp.put("Taha",23);
        mp.put("talha",21);
        mp.put("tariq",19);
        mp.put("tahira",17);
        mp.put("taiyab",15);

        System.out.println(mp.keySet());
        System.out.println(mp.entrySet());
        System.out.println(mp.values());

        mp.remove("tariq");
        System.out.println(mp.entrySet());

        System.out.println(mp.containsKey("tariq"));
        System.out.println(mp.containsKey("taiyab"));
        mp.putIfAbsent("taha",26);
        mp.putIfAbsent("tariq",23);
        System.out.println(mp.entrySet());


    }

}
