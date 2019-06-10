package code401Challenges.stacksandqueues;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class QueueTest {

    @Test
    public void enqueue_One() {
        Queue queueTest = new Queue();
        queueTest.enqueue(3);

        assertEquals(3, queueTest.getFront());
        assertEquals(3, queueTest.getBack());
    }

    @Test
    public void enqueueMany() {
        Queue queueTest = new Queue();
        queueTest.enqueue(3);
        queueTest.enqueue(6);
        queueTest.enqueue(4);
        queueTest.enqueue(2);

        assertEquals(3, queueTest.getFront());
        assertEquals(2, queueTest.getBack());
        assertEquals(4, queueTest.getN());
    }

    @Test
    public void dequeue() {
        Queue queueTest = new Queue();
        queueTest.enqueue(3);
        queueTest.enqueue(6);
        queueTest.enqueue(4);
        queueTest.enqueue(2);

        assertEquals(3, queueTest.dequeue());
        assertEquals(6, queueTest.getFront());
        assertEquals(2, queueTest.getBack());
        assertEquals(3, queueTest.getN());
    }

    @Test
    public void dequeueUntilEmpty() {
        Queue queueTest = new Queue();
        queueTest.enqueue(3);
        queueTest.enqueue(6);
        queueTest.enqueue(4);
        queueTest.enqueue(2);
        queueTest.dequeue();
        queueTest.dequeue();
        queueTest.dequeue();
        queueTest.dequeue();

        assertTrue( queueTest.isEmpty());
    }

    @Test(expected = NoSuchElementException.class)
    public void test_dequeue_empty(){
        Queue queueTest = new Queue();
        queueTest.dequeue();
    }

    @Test
    public void peek() {
        Queue queueTest = new Queue();
        queueTest.enqueue(3);
        queueTest.enqueue(6);
        queueTest.enqueue(4);
        queueTest.enqueue(2);

        assertEquals(3, queueTest.peek());
    }

    @Test(expected = NoSuchElementException.class)
    public void peekEmpty() {
        Queue queueTest = new Queue();

        queueTest.peek();
    }

    @Test
    public void isEmpty() {
        Queue queueTest = new Queue();
        assertTrue(queueTest.isEmpty());
    }
}