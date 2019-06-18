package code401Challenges.tree;

public class BinarySearchTree<T extends Comparable<T>> extends Tree<T>{

    BinaryNode<T> rootSearch;

    public void add(T value){
        BinaryNode<T> newNode = new BinaryNode<>(value);
        BinaryNode<T> root = this.addHelper(newNode, value);
    }

    public BinaryNode<T> addHelper(BinaryNode<T> newNode, T value) {

        if (newNode == null) {
            return new BinaryNode<>(value);
        }

        if (newNode.key.compareTo(value) < 0) {
            newNode = this.addHelper(newNode.getLeft(), value);

        } else {
            newNode = this.addHelper(root.getRight(), value);
        }

        return newNode;
    }

    public boolean contains(T value) {

        return this.containsHelper(this.getRoot(), value);
    }

    private boolean containsHelper(BinaryNode<T> newNode, T value) {
        if (newNode == null)
            return false;

        if (newNode.getKey().equals(value))
            return true;

        return (newNode.getKey().compareTo(value) < 0) ?
                this.containsHelper(newNode.getLeft(), value) :
                this.containsHelper(newNode.getRight(), value);
    }
}
