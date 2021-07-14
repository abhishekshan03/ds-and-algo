package datastructures.stacksqueues;

import datastructures.linkedlist.LinkedNode;

public class MyQueueLL
{
    private LinkedNode front;
    private LinkedNode rear;

    public void enqueue (int val) {
        LinkedNode temp = new LinkedNode(val, null);
        if (rear == null) {
            rear = temp;
            front = temp;
        } else {
            rear.setNext(temp);
            rear = temp;
        }
    }

    public int dequeue () {
        if (front == null) {
            System.out.println("Queue empty !");
            return -1;
        } else {
            int val = front.getData();
            front = front.getNext();
            if (front == null) {
                rear = null;
            }
            return val;
        }
    }

    public int first ()
    {
        if (front != null) {
            return front.getData();
        } else {
            System.out.println("Queue empty !");
            return -1;
        }
    }

    public int last ()
    {
        if (rear != null) {
            return rear.getData();
        } else {
            System.out.println("Queue empty !");
            return -1;
        }
    }

    public void print ()
    {
        if (front == null) {
            System.out.println("Empty!");
        } else {
            LinkedNode p = front;
            while (p != null) {
                System.out.print("| "+p.getData()+" | => ");
                p = p.getNext();
            }
            System.out.println("NULL");
        }
    }
}
