package code.ti2494;

import java.util.HashSet;
import java.util.Set;

public class Demo2 {
    public static void main(String[] args) {
        String aStr = "leetcode";
        System.out.println(isUnique(aStr));
    }

    public static boolean isUnique(String astr) {
        char[] chars = astr.toCharArray();
        int a = 0;

        for(char c : chars) {
            int bit = c - 'a';

           if((a & (1 << bit)) != 0) {
               return false;
           }
           else {
               a |= 1 << bit;
           }
        }

        return true;
    }
}
