package string;

import java.util.logging.SocketHandler;

public class practice {
    public static void main(String[] args) {
        String str1="world";
        String str2= str1;

        str1="hello";

        System.out.println(str1);
        System.out.println(str2);

    }
}
