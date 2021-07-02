package datastructures.stacksqueues;

import datastructures.linkedlist.LinkedListUtils;
import datastructures.linkedlist.LinkedNode;

/*
  Stack implementation using LinkedList.
  Useful in cases where size is NOT known at compile time.
 */
public class MyStackLL {
    private  LinkedNode[] head;
    //top of stack.
    private  LinkedNode tos = null;
    private int size;
    private int nodesCount = 0;

    public MyStackLL(int size) {
        this.size = size;
    }

    public int pop () {
        underFlowCheck ();
        int r = tos.getData();
        LinkedNode t = tos;
        tos = tos.getNext();
        t.setNext(null);
        nodesCount--;
        return r;
    }

    public void push (int s) {
        overFlowCheck ();
        LinkedNode node = new LinkedNode(s, tos);
        nodesCount++;
        tos = node;
    }

    public int topOfStack () {
        return tos == null ? null : tos.getData();
    }

    public int peek (int index) {
        if ((index > nodesCount - 1) || index < 0) {
            throw new RuntimeException("invalid index !");
        }
        else {
            LinkedNode temp = tos;
            for (int i = 0; i < index; i++) {
                temp = temp.getNext();
            }
            return temp.getData();
        }
    }

    private  void underFlowCheck() {
        if (tos == null) {
            throw new RuntimeException("stack is empty !");
        }
    }

    private  void overFlowCheck() {
        if (nodesCount == size) {
            throw new RuntimeException("stack is full !");
        }
    }

    public int getNodesCount() {
        return nodesCount;
    }

    public void viewStackLL () {
        LinkedListUtils.prettyPrintList(tos);
    }
}
