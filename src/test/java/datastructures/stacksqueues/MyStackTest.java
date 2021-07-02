package datastructures.stacksqueues;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyStackTest {

    //private static MyStack stack;
    private static MyStackLL stack;

    @BeforeAll
    static void init ()
    {
        stack = new MyStackLL(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
    }
    @Test
    void testUnderFlow () {
        MyStack stack = new MyStack(5);
        Exception exception = assertThrows(RuntimeException.class, () -> {
            stack.pop();
        });

        String expectedMessage = "stack is empty !";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void testOverFlow () {
        Exception exception = assertThrows(RuntimeException.class, () -> {
            stack.push(123);
        });

        String expectedMessage = "stack is full !";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void testPrint () {
        for (int i = 0; i < 5; i++) {
            System.out.println(stack.pop());
        }
    }

    @Test
    void testPrettyPrint () {
       stack.viewStackLL();
    }

    @Test
    void testPeek () {
        int ele = stack.peek(4);
        System.out.println(ele);
    }

    @Test
    void testPop() {
        int ele1 = stack.pop();
        int ele2 = stack.pop();

        System.out.println("Element1: "+ele1);
        System.out.println("Element2: "+ele2);

        stack.viewStackLL();
    }
}
