package code401Challenges.tree;

public class BinaryNode<T> {

        T key;
        BinaryNode<T> left;
        BinaryNode<T> right;

        public BinaryNode(T value){

            key = value;
            left = null;
            right = null;
        }

    // Setters


    public void setKey(T key) {
        this.key = key;
    }

    public void setLeft(BinaryNode<T> left) {
        this.left = left;
    }

    public  void setRight(BinaryNode<T> right) {
        this.right = right;
    }

    public T getKey() {
        return key;
    }

    public BinaryNode<T> getLeft() {
        return left;
    }

    public BinaryNode<T> getRight() {
        return right;
    }
}
