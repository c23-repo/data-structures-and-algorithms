package code401Challenges.linkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void insert() {
        LinkedList classTest = new LinkedList();
        classTest.insert(5);

        assertTrue(classTest.head.data == 5);

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

    @Test
    public void test_append_one_val() {
        LinkedList classTest = new LinkedList();
        classTest.append(6);

        assertEquals("LinkedList: 6->null", classTest.print());

    }

    @Test
    public void test_append() {
        LinkedList classTest = new LinkedList();
        classTest.append(6);
        classTest.append(4);
        classTest.append(9);
        classTest.append(3);
        classTest.append(5);

        assertEquals("LinkedList: 6->4->9->3->5->null", classTest.print());

    }

    @Test
    public void test_append_with_insert() {
        LinkedList classTest = new LinkedList();
        classTest.insert(6);
        classTest.append(4);
        classTest.append(9);
        classTest.append(3);
        classTest.insert(5);

        assertEquals("LinkedList: 5->6->4->9->3->null", classTest.print());

    }

    @Test
    public void test_insertBefore() {
        LinkedList classTest = new LinkedList();
        classTest.append(4);
        classTest.append(9);
        classTest.append(3);
        classTest.insertBefore(3, 5);

        assertEquals("LinkedList: 4->9->5->3->null", classTest.print());
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_InsertBeforeEmpty_Error() {
        LinkedList testLL = new LinkedList();

        testLL.insertBefore(86, 5);
    }

    @Test
    public void test_dbl_insertBefore() {
        LinkedList classTest = new LinkedList();
        classTest.append(4);
        classTest.append(9);
        classTest.append(3);
        classTest.insertBefore(3, 5);
        classTest.insertBefore(5, 6);

        assertEquals("LinkedList: 4->9->6->5->3->null", classTest.print());
    }

    @Test
    public void test_insertAfter() {
        LinkedList classTest = new LinkedList();
        classTest.append(4);
        classTest.append(9);
        classTest.append(3);
        classTest.insertAfter(3, 5);

        assertEquals("LinkedList: 4->9->3->5->null", classTest.print());
    }

    @Test
    public void test_dbl_insertAfter() {
        LinkedList classTest = new LinkedList();
        classTest.append(4);
        classTest.append(9);
        classTest.append(3);
        classTest.insertAfter(3, 5);
        classTest.insertAfter(4, 6);

        assertEquals("LinkedList: 4->6->9->3->5->null", classTest.print());
    }


    @Test
    public void test_nodeFinderFromEnd() {
        LinkedList classTest = new LinkedList();
        classTest.append(6);
        classTest.append(4);
        classTest.append(9);
        classTest.append(3);
        classTest.append(5);

        assertEquals(9, classTest.nodeFinderFromEnd(2));
        assertEquals(5, classTest.nodeFinderFromEnd(0));
        assertEquals(6, classTest.nodeFinderFromEnd(4));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_nodeFinderFromEnd_k_greaterThanLength() {
        LinkedList classTest = new LinkedList();
        classTest.append(6);
        classTest.append(4);
        classTest.append(9);
        classTest.append(3);
        classTest.append(5);

        classTest.nodeFinderFromEnd(7);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_nodeFinderFromEnd_k_equalToLength() {
        LinkedList classTest = new LinkedList();
        classTest.append(6);
        classTest.append(4);
        classTest.append(9);
        classTest.append(3);
        classTest.append(5);

        classTest.nodeFinderFromEnd(5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_nodeFinderFromEnd_k_isNegative() {
        LinkedList classTest = new LinkedList();
        classTest.append(6);
        classTest.append(4);
        classTest.append(9);
        classTest.append(3);
        classTest.append(5);

        classTest.nodeFinderFromEnd(-2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_nodeFinderFromEnd_sizeOfOne() {
        LinkedList classTest = new LinkedList();
        classTest.append(6);

        classTest.nodeFinderFromEnd(2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_mergeLists_empty() {
        LinkedList one = new LinkedList(), two = new LinkedList();

        LinkedList.mergeLists(one, two);
    }

    @Test
    public void test_mergeLists_secondEmpty() {
        LinkedList one = new LinkedList(), two = new LinkedList();
        one.append(5);
        one.append(3);
        one.append(2);

        assertEquals("should return first list",
                "LinkedList: 5->3->2->null",
                LinkedList.mergeLists(one, two).print());

    }

    @Test
    public void test_mergeLists_firstEmpty() {
        LinkedList one = new LinkedList(), two = new LinkedList();
        two.append(5);
        two.append(3);
        two.append(2);

        assertEquals("should return second list",
                "LinkedList: 5->3->2->null",
                LinkedList.mergeLists(one, two).print());
    }

    @Test
    public void test_mergelist_even() {
        LinkedList one = new LinkedList(), two = new LinkedList();
        one.append(5);
        two.append(6);
        one.append(3);
        two.append(8);
        one.append(2);
        two.append(1);

        assertEquals("should return first list",
                "LinkedList: 5->6->3->8->2->1->null",
                LinkedList.mergeLists(one, two).print());
    }

    @Test
    public void test_mergelist_unevenOneLonger() {
        LinkedList one = new LinkedList(), two = new LinkedList();
        one.append(5);
        two.append(6);
        one.append(3);
        two.append(8);
        one.append(2);
        two.append(1);
        one.append(9);
        one.append(4);

        assertEquals("should return first list",
                "LinkedList: 5->6->3->8->2->1->9->4->null",
                LinkedList.mergeLists(one, two).print());
    }

    @Test
    public void test_mergelist_unevenTwoLonger() {
        LinkedList one = new LinkedList(), two = new LinkedList();
        one.append(5);
        two.append(6);
        one.append(3);
        two.append(8);
        one.append(2);
        two.append(1);
        two.append(9);
        two.append(4);

        assertEquals("should return first list",
                "LinkedList: 5->6->3->8->2->1->9->4->null",
                LinkedList.mergeLists(one, two).print());
    }
}