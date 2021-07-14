package datastructures.stacksqueues;

import datastructures.linkedlist.LinkedListUtils;
import datastructures.linkedlist.LinkedNode;
import datastructures.linkedlist.LinkedNodeStr;

/*
  Stack implementation using LinkedList.
  Useful in cases where size is NOT known at compile time.
 */
public class MyStackLLStr {
    private  LinkedNode[] head;
    //top of stack.
    private LinkedNodeStr tos = null;
    private int size;
    private int nodesCount = 0;

    public MyStackLLStr(int size) {
        this.size = size;
    }

    public String pop () {
        underFlowCheck ();
        String r = tos.getData();
        LinkedNodeStr t = tos;
        tos = tos.getNext();
        t.setNext(null);
        nodesCount--;
        return r;
    }

    public void push (String s) {
        overFlowCheck ();
        LinkedNodeStr node = new LinkedNodeStr(s, tos);
        nodesCount++;
        tos = node;
    }

    public String topOfStack () {
        return tos == null ? null : tos.getData();
    }

    public String peek (int index) {
        if ((index > nodesCount - 1) || index < 0) {
            throw new RuntimeException("invalid index !");
        }
        else {
            LinkedNodeStr temp = tos;
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
