package code401Challenges.TreeIntersection;

import code401Challenges.tree.BinaryNode;
import code401Challenges.tree.Tree;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class TreeIntersectionTest {

    private Tree<Integer> treeA;

    @Before
    public void treeFrame() {

        BinaryNode<Integer> rootA = new BinaryNode<>(1);
        BinaryNode<Integer> lA = new BinaryNode<>(2);
        BinaryNode<Integer> rA = new BinaryNode<>(8);
        BinaryNode<Integer> llA = new BinaryNode<>(4);
        BinaryNode<Integer> lrA = new BinaryNode<>(7);
        BinaryNode<Integer> rlA = new BinaryNode<>(-6);
        BinaryNode<Integer> rrA = new BinaryNode<>(9);

        this.treeA = new Tree();
        this.treeA.setRoot(rootA);
        rootA.setLeft(lA);
        lA.setLeft(llA);
        lA.setRight(lrA);
        rootA.setRight(rA);
        rA.setLeft(rlA);
        rA.setRight(rrA);


    }

    @Test
    public void testTreeInsertion() {

        BinaryNode<Integer> rootB = new BinaryNode<>(1);
        BinaryNode<Integer> lB = new BinaryNode<>(3);
        BinaryNode<Integer> rB = new BinaryNode<>(15);
        BinaryNode<Integer> llB = new BinaryNode<>(10);
        BinaryNode<Integer> lrB = new BinaryNode<>(7);
        BinaryNode<Integer> rlB = new BinaryNode<>(8);
        BinaryNode<Integer> rrB = new BinaryNode<>(9);

        Tree treeB = new Tree();
        treeB.setRoot(rootB);
        rootB.setLeft(lB);
        lB.setLeft(llB);
        lB.setRight(lrB);
        rootB.setRight(rB);
        rB.setLeft(rlB);
        rB.setRight(rrB);


        assertTrue("should be equal to each other",
                TreeIntersection.treeIntersection(this.treeA, treeB)
                        .equals(new ArrayList(Arrays.asList(1, 7, 8, 9))));
    }

    @Test
    public void testTreeInsertionMultiple() {

        BinaryNode<Integer> rootB = new BinaryNode<>(1);
        BinaryNode<Integer> lB = new BinaryNode<>(1);
        BinaryNode<Integer> rB = new BinaryNode<>(7);
        BinaryNode<Integer> llB = new BinaryNode<>(10);
        BinaryNode<Integer> lrB = new BinaryNode<>(7);
        BinaryNode<Integer> rlB = new BinaryNode<>(8);
        BinaryNode<Integer> rrB = new BinaryNode<>(9);

        Tree treeB = new Tree();
        treeB.setRoot(rootB);
        rootB.setLeft(lB);
        lB.setLeft(llB);
        lB.setRight(lrB);
        rootB.setRight(rB);
        rB.setLeft(rlB);
        rB.setRight(rrB);


        assertTrue("should be equal to each other",
                TreeIntersection.treeIntersection(this.treeA, treeB)
                        .equals(new ArrayList(Arrays.asList(1, 7, 8, 9))));
    }

    @Test
    public void testTreeInsertionNegative() {

        BinaryNode<Integer> rootB = new BinaryNode<>(1);
        BinaryNode<Integer> lB = new BinaryNode<>(1);
        BinaryNode<Integer> rB = new BinaryNode<>(-6);
        BinaryNode<Integer> llB = new BinaryNode<>(10);
        BinaryNode<Integer> lrB = new BinaryNode<>(7);
        BinaryNode<Integer> rlB = new BinaryNode<>(8);
        BinaryNode<Integer> rrB = new BinaryNode<>(9);

        Tree treeB = new Tree();
        treeB.setRoot(rootB);
        rootB.setLeft(lB);
        lB.setLeft(llB);
        lB.setRight(lrB);
        rootB.setRight(rB);
        rB.setLeft(rlB);
        rB.setRight(rrB);


        assertTrue("should be equal to each other",
                TreeIntersection.treeIntersection(this.treeA, treeB)
                        .equals(new ArrayList(Arrays.asList(1, -6, 7, 8, 9))));
    }

}