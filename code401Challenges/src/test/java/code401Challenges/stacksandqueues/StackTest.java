package code401Challenges.stacksandqueues;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void push() {
        Stack classForTest = new Stack();
        classForTest.push(5);
        classForTest.push(8);

        assertEquals(2, classForTest.getN());
    }

    @Test
    public void pushOne() {
        Stack classForTest = new Stack();
        classForTest.push(5);

        assertEquals(1, classForTest.getN());
    }

    @Test(expected = NoSuchElementException.class)
    public void popEmpty() {
        Stack classForTest = new Stack();

        assertEquals(0, classForTest.pop());
    }

    @Test
    public void pop() {
        Stack classTest = new Stack();
        classTest.push(2);
        classTest.push(5);
        classTest.push(4);
        classTest.push(9);

        assertEquals(9, classTest.pop());
        assertEquals(3, classTest.getN());
    }

    @Test
    public void popMany() {
        Stack classTest = new Stack();
        classTest.push(2);
        classTest.push(5);
        classTest.push(4);
        classTest.push(9);
        classTest.pop();
        classTest.pop();
        classTest.pop();
        classTest.pop();

        assertEquals(0, classTest.getN());
    }

    @Test
    public void peek() {
        Stack classTest = new Stack();
        classTest.push(2);
        classTest.push(5);
        classTest.push(4);
        classTest.push(7);

        assertEquals(7, classTest.peek());
        assertEquals(4, classTest.getN());
    }
}