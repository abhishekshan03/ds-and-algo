package datastructures.linkedlist;

public class LinkedNodeStr {
    private String data;
    private LinkedNodeStr next;

    public LinkedNodeStr(String data, LinkedNodeStr next) {
        this.data = data;
        this.next = next;
    }

    public String getData() {
        return data;
    }

    public LinkedNodeStr getNext() {
        return next;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setNext(LinkedNodeStr next) {
        this.next = next;
    }
}
