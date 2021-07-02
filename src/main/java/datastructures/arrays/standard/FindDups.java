package datastructures.arrays.standard;

// a = {3, 5, 7, 7, 12, 13, 14,14,14,14, 21, 22, 34}
public class FindDups {

    public static void main(String[] args) {
        int[] a = {3, 5, 7, 7, 12, 13, 14,14,14,14, 21, 22, 34};
        //findDupsSortedArray(a);
        //findDupsSortedArrayStandard(a);

        findDupsSortedArrayStdWithCount(a);
    }
    private static void findDupsSortedArray (int[] a) {
        boolean flag = false;
        for (int i = 0;i < a.length - 1; i++) {
            while ((a[i] == a[i+1]) && (i < a.length - 1))  {
                flag = true;
                i++;
            }
            if (flag) {
                System.out.println(a[i]);
                flag = false;
            }
        }
    }

    private static void findDupsSortedArrayStandard (int[] a) {
        int lastDup = -1;
        for (int i = 0;i < a.length - 1; i++) {
            if ((a[i] == a[i+1]))  {
                if (a[i] != lastDup) {
                    lastDup = a[i];
                    System.out.println(lastDup);
                }
            }
        }
    }

    private static void findDupsSortedArrayStdWithCount (int[] a) {
        int lastDup = -1;
        for (int i = 0;i < a.length - 1; i++) {
            if ((a[i] == a[i+1]))  {
                System.out.print("Duplicate: "+a[i]+ ", Count: ");
                int j = i + 1;
                int count = 1;
                while ((a[j] == a[j+1]) && (j+1 < a.length)) {
                    count++;
                    j++;
                }
                System.out.println(count);
                i = j;
            }
        }
    }
}
