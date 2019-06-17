package code401Challenges.tree;

public class BinarySearchTree<T extends Comparable<T>> {

    BinaryNode<T> rootSearch;

    public void add(T value){
        BinaryNode<T> newNode = new BinaryNode<>(value);
        rootSearch = searchTreeHelper(newNode, value);

    }

    public BinaryNode<T> searchTreeHelper(BinaryNode<T> newNode, T value) {

        if (newNode == null) {
            return new BinaryNode<>(value);
        }

        if (newNode.key.compareTo(value) < 0) {
            newNode = searchTreeHelper(newNode.right, value);
        }
    }
}
