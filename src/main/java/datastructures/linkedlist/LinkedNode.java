package datastructures.linkedlist;

public class LinkedNode {
    private int data;
    private LinkedNode next;

    public LinkedNode(int data, LinkedNode next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public LinkedNode getNext() {
        return next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(LinkedNode next) {
        this.next = next;
    }
}
