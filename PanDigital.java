/* This is a java program to check if a given number is 1-9 pan digital */

import java.util.HashSet;

public class PanDigital {
    public static boolean isPanDigital(long num) {
        HashSet<Character> set = new HashSet<>();
        for (Character c: Long.toString(num).toCharArray()) {
            if (c == '0'){
                return false;
            }
            set.add(c);
        }
        return set.size() == 9;
    }
}
