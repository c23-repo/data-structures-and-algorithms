package code401Challenges.tree;
import code401Challenges.stacksandqueues.Node;
import code401Challenges.stacksandqueues.Queue;

import java.util.ArrayList;


public class Tree<T> {
    BinaryNode<T> root;

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

    public String breadthFirst(Tree tree) {
        Queue<BinaryNode> breadthQueue = new Queue<>();
        BinaryNode node;
        String treeValues = "";

        if (tree.root == null) {
            throw new IllegalArgumentException("The tree is empty");
        } else {
            breadthQueue.enqueue(tree.root);
            while (!breadthQueue.isEmpty()) {
                node = breadthQueue.dequeue();
                treeValues += node.key + "\n";

                if (node.left != null) breadthQueue.enqueue(node.left);
                if (node.right != null) breadthQueue.enqueue(node.right);
            }
        }
        return treeValues;
    }

    public int findMaxValue(Tree tree){
        if (tree.root == null) throw new IllegalArgumentException("The tree is empty");
        return findMaxValueHelper(tree.root);
    }

    private int findMaxValueHelper(BinaryNode node){
        int max = (int) node.key;
        if (node.left != null) max = Math.max(max,findMaxValueHelper(node.left));
        if (node.right != null) max = Math.max(max,findMaxValueHelper(node.right));
        return max;
    }



    // getters
    public BinaryNode<T> getRoot() {
        return root;
    }

    public void setRoot(BinaryNode<T> root) {
        this.root = root;
    }
}
