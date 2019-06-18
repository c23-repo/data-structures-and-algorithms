package code401Challenges.FizzBuzzTree;

import code401Challenges.tree.BinaryNode;
import code401Challenges.tree.Tree;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class FizzBuzzTreeTest {

    @Test
    public void fizzBuzzTree() {
        Tree<Integer> tree = new Tree<>();
        BinaryNode<Integer> root = new BinaryNode<>(5);
        BinaryNode<Integer> l = new BinaryNode<>(9);
        BinaryNode<Integer> r = new BinaryNode<>(10);
        BinaryNode<Integer> ll = new BinaryNode<>(15);
        BinaryNode<Integer> lr = new BinaryNode<>(30);
        BinaryNode<Integer> rl = new BinaryNode<>(21);
        BinaryNode<Integer> rr = new BinaryNode<>(12);

        tree.setRoot(root);
        root.setLeft(l);
        l.setLeft(ll);
        l.setRight(lr);
        root.setRight(r);
        r.setLeft(rl);
        r.setRight(rr);

        FizzBuzzTree treeTest = new FizzBuzzTree();
        treeTest.fizzBuzzTree(tree);
        assertEquals("Will return tree with Fizz and Buzz as replacements",
                new ArrayList<>(Arrays.asList("FizzBuzz", "FizzBuzz", "Fizz", "Fizz", "Fizz", "Buzz", "Buzz")),
                tree.postOrder());
    }

    @Test
    public void fizzBuzzTreeNegative() {
        Tree<Integer> tree = new Tree<>();
        BinaryNode<Integer> root = new BinaryNode<>(-5);
        BinaryNode<Integer> l = new BinaryNode<>(-9);
        BinaryNode<Integer> r = new BinaryNode<>(-10);
        BinaryNode<Integer> ll = new BinaryNode<>(15);
        BinaryNode<Integer> lr = new BinaryNode<>(30);
        BinaryNode<Integer> rl = new BinaryNode<>(-21);
        BinaryNode<Integer> rr = new BinaryNode<>(13);

        tree.setRoot(root);
        root.setLeft(l);
        l.setLeft(ll);
        l.setRight(lr);
        root.setRight(r);
        r.setLeft(rl);
        r.setRight(rr);

        FizzBuzzTree treeTest = new FizzBuzzTree();
        treeTest.fizzBuzzTree(tree);
        assertEquals("Will return tree with Fizz and Buzz as replacements",
                new ArrayList<>(Arrays.asList("FizzBuzz", "FizzBuzz", "Fizz", "Fizz", 13, "Buzz", "Buzz")),
                tree.postOrder());
    }

    @Test(expected = IllegalArgumentException.class)
    public void fizzBuzzEmpty() {

        Tree<Integer> tree = new Tree<>();
        FizzBuzzTree treeTest = new FizzBuzzTree();
        treeTest.fizzBuzzTree(tree);
    }
}