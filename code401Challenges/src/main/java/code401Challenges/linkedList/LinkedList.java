package code401Challenges.linkedList;



public class LinkedList {

    Node head;

    static class Node {
        int data;
        Node next;
        //Node previous;
        Node(int value){
            this.data = value;
            this.next = null;
        }

    }

    LinkedList(){
        this.head = null;
    }

    public void insert(int value){
        Node tempNode = new Node(value);
        tempNode.next = head;
        head = tempNode;
    }

    public boolean includes(int value){
        Node iterator = head;
        while(iterator != null){
            if (iterator.data == value) {
                return true;
            }
            iterator = iterator.next;
        }
        return false;
    }

    public String print(){
        Node iterator = head;
        StringBuilder str = new StringBuilder();
        str.append("LinkedList: ");
        while(iterator != null){
            str.append(iterator.data);
            str.append("->");
            iterator = iterator.next;
        }
        str.append("null");
        return str.toString();
    }

}
