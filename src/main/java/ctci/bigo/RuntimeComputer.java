package ctci.bigo;

public class RuntimeComputer {

    private static int rec = 0;
    public static void main(String[] args) {
        permutations("abc");
    }

    private  static void permutations (String str) {
        permutations(str, "");
    }

    private static void permutations(String str, String prefix) {
        rec++;
        //System.out.println("----- start " + rec + " level ...." );

        if (str.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                System.out.println("---- Iteration "+ i);
                String rem = str.substring(0,i) + str.substring(i+1);
                System.out.println("----- Calling with .... rem :" + rem + ", and perfix: "+ prefix + str.charAt(i));
                permutations(rem, prefix + str.charAt(i));
            }
        }
        //System.out.println("----- end " + rec + " level ...." );
    }
}
