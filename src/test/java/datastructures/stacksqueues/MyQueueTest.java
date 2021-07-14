package datastructures.stacksqueues;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyQueueTest {
    private static MyQueueLL queue;

    @BeforeAll
    static void init ()
    {
        queue = new MyQueueLL();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
    }
}
