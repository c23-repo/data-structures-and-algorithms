package queueWithStacks;

import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class PseudoQueueTest {

    @Test
    public void enqueue() {
        PseudoQueue classTest = new PseudoQueue();
        classTest.enqueue(5);
        classTest.enqueue(4);
        classTest.enqueue(2);

        assertEquals(2, classTest.stackEnq.peek());
    }

    @Test
    public void dequeue() {
        PseudoQueue classTest = new PseudoQueue();
        classTest.enqueue(5);
        classTest.enqueue(4);
        classTest.enqueue(2);
        classTest.dequeue();

        assertEquals(4, classTest.dequeue());
    }

    @Test(expected = EmptyStackException.class)
    public void dequeueIsEmpty() {
        PseudoQueue classTest = new PseudoQueue();
        classTest.dequeue();
    }
}