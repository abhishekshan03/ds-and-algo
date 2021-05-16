package strings;

import java.util.*;

public class SherlockAndValidString {

    // Complete the isValid function below.
    static String isValid (String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            Character chr = s.charAt(i);
            Integer count = map.get(chr);
            if (count != null) {
                map.put(chr, ++count);
            }
            else {
                map.put(chr, 1);
            }
        }

        validate(map);
        return null;
    }

    private static void validate (Map<Character, Integer> map) {
        Map<Integer, Integer> revMap = new HashMap<Integer, Integer>();
        Set<Character> set = map.keySet();
        Iterator<Character> itr = set.iterator();
        while (itr.hasNext()) {
            Character chr = itr.next();
            Integer value = map.get(chr);
            Integer size = revMap.get(value);
            if (size != null) {
                revMap.put(value, ++size);
            }
            else {
                revMap.put(value, 1);
            }

            if (revMap.size() == 2) {
                while (true) {

                }
            }
            /* For a valid string we have two cases
               1. two kinds of values,  being 1 greater than other
               2. One entry has value 1 and all other has a same value other than one
             */
        }
    }
}
