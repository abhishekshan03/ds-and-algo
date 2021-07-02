package datastructures.arrays.standard;

public class ArrayUtils {

    public static void printArray (int[] a) {
        if(a.length > 0)
            System.out.print("\n[");
        for(int i = 0; i < a.length; i++) {
            if (i != a.length-1) {
                System.out.print(a[i] + ", ");
            } else {
                System.out.println(a[i] + "]");
            }
        }
    }

    public static boolean isSorted (int[] a) {
        for (int i = 0 ; i < a.length - 1 ; i++) {
            if (a[i] > a[i+1]) {
                return false;
            }
        }
        return true;
    }
}
