package slidingandtwoo;

import java.util.HashMap;

public class fruitbasket {

    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> mp= new HashMap<>();

        int l=0;
        int r=0;
        int len=0;
        int maxl=0;

        while (r<fruits.length){

            if(mp.containsKey(fruits[r])){
                mp.put(fruits[r],mp.get(fruits[r])+1);
            }
            else mp.put(fruits[r],1);


            if (mp.size()>2){
                mp.put(fruits[l],mp.get(fruits[l])-1);
                if (mp.get(fruits[l])==0) mp.remove(fruits[l]);
                l++;
            }
            len=r-l+1;
            maxl=Math.max(len,maxl);
            r++;

        }
        return  maxl;
    }
}
