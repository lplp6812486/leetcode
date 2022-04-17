package code.ti2494;

import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
        String aStr = "leetcode";
        System.out.println(isUnique(aStr));
    }

    public static boolean isUnique(String astr) {
        char[] chars = astr.toCharArray();
        Set<Character> set = new HashSet<>();

        for (char aChar : chars) {
            set.add(aChar);
        }

        return set.size() == chars.length;
    }
}
