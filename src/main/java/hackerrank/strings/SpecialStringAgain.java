package hackerrank.strings;

import java.util.ArrayList;
import java.util.List;

public class SpecialStringAgain {

    // Complete the substrCount function below.
    static long substrCount(int n, String s) {
        List<String> bag = new ArrayList<String>();
        Character prev = null, curr = null;
        int state = 0;//0 => reading, 1 => counting
        int counter = 0, result = 0;
        for (int i = 0; i < s.length(); i++) {
            curr = s.charAt(i);
            if (curr.equals(prev)) {
                counter++;
                if (state != 1) {
                    state = 1;
                }
            }
            else {
                bag.add(curr.toString());
                result++;
                if (state == 1) {
                    result =result + counter;
                    counter = 0;
                    state = 0;
                }
            }

            // handling the case when this iteration is the last
            if (i == s.length() - 1) {
                if (state == 1) {
                    result = result + counter;
                    counter = 0;
                    state = 0;
                }
            }
            prev = curr;
        }
        return result;
    }
}
