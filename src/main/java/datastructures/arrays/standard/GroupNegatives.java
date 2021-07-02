package datastructures.arrays.standard;
//given an array of integers group negatives at the staring of the array.
public class GroupNegatives {

    private static int[] a = {4,-3,66,-98,44,32,-2,34};

    private static int[] groupNegatives (int[] a) {
        int i = 0; int j = a.length-1;
        while (i < j) {
            while(a[i] < 0) {
                i++;
            }
            while(a[j] >= 0) {
                j--;
            }
            if (i < j) {
                swap(i,j,a);
                i++;j--;
            }
        }
        return a;
    }

    private static void swap (int i , int j , int [] a) {
        int k;
        k = a[i];
        a[i] = a[j];
        a[j] = k;
    }

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

    public static void main (String[] args) {
        System.out.println("Question: ");
        printArray(a);
        System.out.println("Answer : ");
        groupNegatives(a);
        printArray(a);
    }

}
