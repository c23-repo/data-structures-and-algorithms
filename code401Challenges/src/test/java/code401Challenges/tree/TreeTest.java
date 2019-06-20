package code401Challenges.tree;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class TreeTest {

    public Tree<Integer> tree;

    @Before
    public void treeFrame() {
        this.tree = new Tree();

        BinaryNode<Integer> root = new BinaryNode<>(1);
        BinaryNode<Integer> l = new BinaryNode<>(2);
        BinaryNode<Integer> r = new BinaryNode<>(3);
        BinaryNode<Integer> ll = new BinaryNode<>(4);
        BinaryNode<Integer> lr = new BinaryNode<>(5);
        BinaryNode<Integer> rl = new BinaryNode<>(6);
        BinaryNode<Integer> rr = new BinaryNode<>(7);

        root.setLeft(l);
        l.setLeft(ll);
        l.setRight(lr);
        root.setRight(r);
        r.setLeft(rl);
        r.setRight(rr);
        this.tree.setRoot(root);
    }
    @Test
    public void inOrder() {
        assertEquals(new ArrayList<>(Arrays.asList(4, 2, 5, 1, 6, 3, 7)), this.tree.inOrder());
    }

    @Test
    public void postOrder() {
        assertEquals(new ArrayList<>(Arrays.asList(4, 5, 2, 6, 7, 3, 1)), this.tree.postOrder());
    }

    @Test
    public void preOrder() {
        assertEquals(new ArrayList<>(Arrays.asList(1, 2, 4, 5, 3, 6, 7)), this.tree.preOrder());
    }

    @Test
    public void breadthFirst() { assertEquals(("1\n2\n3\n4\n5\n6\n7\n"), this.tree.breadthFirst(tree));}

    @Test
    public void findMaxValue() { assertEquals(7, this.tree.findMaxValue(tree)); // returns largest value
    }
}