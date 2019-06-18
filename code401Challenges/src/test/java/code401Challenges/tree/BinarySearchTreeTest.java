package code401Challenges.tree;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    public BinarySearchTree<Integer> testSearchTree;

    @Before
    public void setupTests() {
        this.testSearchTree = new BinarySearchTree<>();
    }

    @After
    public void emptyTest() {
        this.testSearchTree = null;
    }

    @Test
    public void testInstantiate() {
        BinarySearchTree<Integer> testBstInt = new BinarySearchTree<>();
        BinarySearchTree<Character> testBstChar = new BinarySearchTree<>();
        BinarySearchTree<String> testBstTString = new BinarySearchTree<>();
    }


    @Test
    public void emptyTreeTest() {
        assertFalse("Should be equal to false",
                this.testSearchTree.contains(1)
        );
        assertFalse("Should be equal to false",
                this.testSearchTree.contains(46)
        );
        assertFalse("Should be equal to false",
                this.testSearchTree.contains(-34)
        );
    }
    

    /*
    @Test
    public void add() {
    }

    @Test
    public void contains() {
    }
    */
}