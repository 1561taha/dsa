package string;

public class compress {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder();
        String str= "aaaabbbbcccddde";

        String ans=""+str.charAt(0);
        int count=0;
        for (int i=1;i<str.length();i++)
        {
            char curr=str.charAt(i);
            char pre=str.charAt(i-1);
            if (pre==curr)
            {
                count++;
            }
            else {
                if (count>1)
                    ans+=count;
                count=1;
                ans+=curr;

            }
        }
        if (count>1)
            ans+=count;
        System.out.println(ans);
    }
}
