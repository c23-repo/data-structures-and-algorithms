package code401Challenges.FizzBuzzTree;

import code401Challenges.tree.BinaryNode;
import code401Challenges.tree.Tree;

public class FizzBuzzTree<T> {

    public Tree<BinaryNode> fizzBuzzTree(Tree<BinaryNode> binaryNodeTree){

        if (binaryNodeTree.getRoot() == null){
            throw new IllegalArgumentException("Tree is empty");
        }

        fizzOrBuzzSearch(binaryNodeTree.getRoot());
        return binaryNodeTree;

    }

    public BinaryNode<T> fizzOrBuzzSearch(BinaryNode node) {
        if (node == null){
            return null;
        } else {
            createFizzBuzz(node);
        }
        fizzOrBuzzSearch(node.getLeft());
        fizzOrBuzzSearch(node.getRight());
        return node;

    }

    public void createFizzBuzz(BinaryNode node) {
        if ((int) node.getKey() %3 == 0 && (int) node.getKey() %5 == 0){
            node.setKey("FizzBuzz");
        } else if ((int) node.getKey() %3 == 0) {
            node.setKey("Fizz");
        } else if ((int) node.getKey() %5 == 0) {
            node.setKey("Buzz");
        }
    }

}
