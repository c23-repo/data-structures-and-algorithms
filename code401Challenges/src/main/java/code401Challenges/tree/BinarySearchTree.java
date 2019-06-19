package code401Challenges.tree;

public class BinarySearchTree<T extends Comparable<T>> extends Tree<T>{

    BinaryNode<T> root;

    public void add(T value){
        root = addHelper(root, value);
    }

    public BinaryNode<T> addHelper(BinaryNode<T> node, T value) {

        if (node == null) {
            return new BinaryNode<>(value);
        }

        if (node.key.compareTo(value) > 0) {
            node.left = addHelper(node.left, value);

        } else {
            node.right = addHelper(node.right, value);
        }

        return node;
    }

    public boolean contains(T value) {

        return this.containsHelper(root, value);
    }

    private boolean containsHelper(BinaryNode<T> node, T value) {
        if (node == null)
            return false;

        if (node.getKey().equals(value))
            return true;

        return (node.getKey().compareTo(value) > 0) ?
                this.containsHelper(node.getLeft(), value) :
                this.containsHelper(node.getRight(), value);
    }
}
