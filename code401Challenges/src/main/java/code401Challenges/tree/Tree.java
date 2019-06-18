package code401Challenges.tree;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;


public class Tree<T> {
    BinaryNode root;

    public Tree(){

        root = null;
    }

    public ArrayList<T> inOrder() {

        ArrayList<T> inOrderList = new ArrayList<>();

        if (this.root != null){
            inOrderHelper(this.root, inOrderList);
        }

        return inOrderList;

    }

    public void inOrderHelper( BinaryNode<T> node, ArrayList<T> inLine){

        if (node.left != null){
            inOrderHelper(node.left, inLine);
        }

        inLine.add(node.key);

        if (node.right != null){
            inOrderHelper(node.right, inLine);
        }
    }


    public ArrayList<T> postOrder() {

        ArrayList<T> postOrderList = new ArrayList<>();

        if (this.root != null) {
            postOrderHelper(this.root, postOrderList);
        }

        return postOrderList;

    }

    public void postOrderHelper(BinaryNode<T> node, ArrayList<T> postLine) {

        if (node.left != null) {
            postOrderHelper(node.left, postLine);
        }

        if (node.right != null) {
            postOrderHelper(node.right, postLine);
        }

        postLine.add(node.key);

    }

    public ArrayList<T> preOrder() {
        ArrayList<T> preOrderList = new ArrayList<>();

        if (this.root != null) {
            preOrderHelper(this.root, preOrderList);
        }

        return preOrderList;
    }

    public void preOrderHelper(BinaryNode<T> node, ArrayList<T> preLine) {

        preLine.add(node.key);

        if (node.left != null) {
            preOrderHelper(node.left, preLine);
        }

        if (node.right != null) {
            preOrderHelper(node.right, preLine);
        }
    }

    // getters


    public BinaryNode getRoot() {
        return root;
    }

    public void setRoot(BinaryNode root) {
        this.root = root;
    }
}
