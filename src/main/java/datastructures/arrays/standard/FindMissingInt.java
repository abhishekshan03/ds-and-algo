package datastructures.arrays.standard;

public class FindMissingInt {

    private static int[] sorted1 = {1,2,3,4,7,9,10,11};
    private static int[] sorted2 = {7,9,10,11,13};

    private static int[] unsorted1 = {4,1,8,3,6,9};
    private static int[] unsorted2 = {4,8,6,9};



    private static void printMissIntsSorted (int[] a) {
        for(int i = 0; i < a.length-1; i++) {
            if (a[i+1] != (a[i] + 1)) {
                for (int val = a[i] + 1; val<a[i+1];val++ ){
                    System.out.println(val);
                }
            }
        }
    }

    private static void printMissIntsUnsorted (int[] a, int l, int h) {
        //low and high boundaries of the range of number
        int size = h - l + 1;
        int[] hashMap = new int[size];

        for(int i = 0; i < a.length; i++) {
            int j = a[i] - l;
            hashMap[j]++;
        }
        for(int i = 0; i < hashMap.length; i++) {
            if (hashMap[i] == 0) {
                System.out.println(i+l);
            }
        }
    }


    public static void main(String[] args) {
        ArrayUtils.printArray(unsorted1);
        //printMissIntsSorted(sorted2);
        //printMissIntsUnsorted(unsorted1,1,10);
        printMissIntsUnsorted(unsorted2,4,11);


    }
}
