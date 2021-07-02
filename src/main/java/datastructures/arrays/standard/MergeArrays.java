package datastructures.arrays.standard;

public class MergeArrays {

    public static void main(String[] args) {
        int [] a = {4, 6, 8, 10};
        int b [] = {1,5, 9};
        ArrayUtils.printArray(mergeSortedArrays(a, b));
    }

    private static int[] mergeSortedArrays (int[] a, int[] b) {
        int size = a.length + b.length;
        int[] c = new int[size];
        int i = 0, j = 0, k =0;
        while ( (i < a.length) && (j < b.length)) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }
        for (;i < a.length;i++) {
            c[k] = a[i];
        }
        for (;j < b.length;i++) {
            c[k] = b[j];
        }
        return c;
    }
}
