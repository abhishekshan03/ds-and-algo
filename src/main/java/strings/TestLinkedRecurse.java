package strings;

public class TestLinkedRecurse {

   static int printKthToLast(LinkedListNode head, int k) {

        if (head == null) {
            return 0;
        }

        System.out.println("Node value is "+ head.data + " and k : " +k);

        int index = printKthToLast(head.next, k) + 1;
        if (index == k) {
            System.out.println(k + "th to last node is " + head.data);
        }
        return index;
    }

    public static void main(String[] args) {
        LinkedListNode head  = new LinkedListNode(1);
        LinkedListNode node = head;
        for ( int i = 2 ; i < 11; i++) {
            node.next = new LinkedListNode(i);
            node = node.next;
        }
        node.next = null;
        printKthToLast(head, 3);

    }

    static class LinkedListNode {
        LinkedListNode next;
        int data;

        LinkedListNode(int data) {
            this.data = data;
        }
    }
}





