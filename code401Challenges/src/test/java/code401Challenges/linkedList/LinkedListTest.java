package code401Challenges.linkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void insert() {
        LinkedList classTest = new LinkedList();
        classTest.insert(5);

        assertTrue( classTest.head.data == 5);

    }

    @Test
    public void test_includes_true() {
        LinkedList classTest = new LinkedList();
        classTest.insert(5);
        classTest.insert(3);
        classTest.insert(10);
        classTest.insert(2);
        classTest.insert(23);
        assertTrue(classTest.includes(10));
    }

    @Test
    public void test_includes_false() {
        LinkedList classTest = new LinkedList();
        classTest.insert(5);
        classTest.insert(3);
        classTest.insert(10);
        classTest.insert(2);
        classTest.insert(23);
        assertFalse("This should return a false", classTest.includes(11));
    }

    @Test
    public void test_print() {
        LinkedList classTest = new LinkedList();
        classTest.insert(5);
        classTest.insert(3);
        classTest.insert(10);
        classTest.insert(2);
        classTest.insert(23);
        assertEquals("LinkedList: 23->2->10->3->5->null", classTest.print());
    }
}