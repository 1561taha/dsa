package recursprac;

import java.util.ArrayList;
import java.util.Scanner;

public class subs {
    public static ArrayList<String> answer(String s)
    {
        ArrayList<String>ans= new ArrayList<>();
        if (s.length()==0){
            ans.add("");
            return ans;
        }
        ArrayList <String> sans=answer(s.substring(1));

        for (String ss:sans)
        {
            ans.add(ss);
            ans.add(s.charAt(0)+ss);
        }
        return ans;
    }
public static void ans2(String s,String s2)
{
    if (s.length()==0)
    {
        System.out.println(s2);
        return;
    }

    ans2(s.substring(1),s2+s.charAt(0));
    ans2(s.substring(1),s2);



}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(" subs are"+answer(s));
        ans2(s,"");

    }
}
