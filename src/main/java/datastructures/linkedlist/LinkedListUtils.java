package datastructures.linkedlist;

public class LinkedListUtils {
    private static String listFmt = "| %s | --> ";
    public static void prettyPrintList (LinkedNode head) {
        while (head != null) {
            System.out.print(String.format(listFmt, head.getData()));
            head = head.getNext();
        }
        System.out.print("NULL");
    }
}
