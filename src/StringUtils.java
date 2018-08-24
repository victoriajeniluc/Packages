/**
 * This class tries to use reverse method of StringUtils class from 1 file and concat method of StringUtils class from another file... this file belongs to www.mycode.com
 *
 * @author Udayan Khattry
 */

public class StringUtils {
    public static String concat(String param1, String param2){
        /**
         * Takes in two arguments and meshes them together
         */
        String res = param1 + " " + param2;
        return res;
    }

    public static String reverse(String str1) {
        /**
         * Covert the string to char array
         * and traverse the array from end to finish
         */

        String rev = " ";

        char c[] = str1.toCharArray();
        for(int i = c.length - 1; i >=0; i--) {
            rev += c[i];
        }
        return rev;
    }
}
