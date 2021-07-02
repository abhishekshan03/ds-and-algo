package datastructures.stacksqueues;
/*
  Stack implementation using arrays.
  Useful in cases where size is known at compile time.
 */
public class MyStack {
    private  int[] data;
    //top of stack.
    private  int tos = -1;

    public MyStack (int size) {
        this.data = new int[size];
    }

    public  int pop () {
        underFlowCheck ();
        return data[tos--];
    }

    public void push (int s) {
        overFlowCheck ();
         data[++tos] = s;
    }

    public int topOfStack () {
        return tos == -1 ? null : data[tos];
    }

    public int peek (int index) {
        if ((index > (data.length - 1)) || index < 0) {
            throw new RuntimeException("invalid index !");
        }
        else {
            return data[tos];
        }
    }

    private  void underFlowCheck() {
        if (tos == -1) {
            throw new RuntimeException("stack is empty !");
        }
    }

    private  void overFlowCheck() {
        if (tos == (data.length - 1)) {
            throw new RuntimeException("stack is full !");
        }
    }
}
