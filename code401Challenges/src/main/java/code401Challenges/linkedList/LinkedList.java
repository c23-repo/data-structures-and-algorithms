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
        Node current = head;
        while(current != null){
            if (current.data == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public String print(){
        Node current = head;
        StringBuilder str = new StringBuilder();
        str.append("LinkedList: ");
        while(current != null){
            str.append(current.data);
            str.append("->");
            current = current.next;
        }
        str.append("null");
        return str.toString();
    }

    public Node append(int value){
        Node newNode = new Node(value);
        if (this.head == null){
            this.head = newNode;
            return newNode;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return newNode;
    }

    public void insertBefore(int target, int value) {

        if (!this.includes(target)) {
            throw new IllegalArgumentException("Target not found");
        }

        Node current = this.head;
        if (current.data == target) {
            this.insert(value);
        } else {
            while (current.next.data != target) {
                current = current.next;
            }
            Node newNode = new Node(value);
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void insertAfter(int target, int value){

        if (!this.includes(target)) {
            throw new IllegalArgumentException("Target not found");
        }

        Node current = this.head;
        while (current.data != target) {
            current = current.next;
        }
        Node newNode = new Node(value);
        newNode.next = current.next;
        current.next = newNode;
    }

    public int nodeFinderFromEnd(int target){
        int length = 0;
        Node current = head;

        if (target < 0)
            throw new IllegalArgumentException("Target must be equal to or greater than 0");

        while (current != null) {
            current = current.next;
            length++;
        }
        current = head;
        if (length <= target) {
            throw new IllegalArgumentException("Target is out of bounds");
        }
        for (int i = 1; i < length - target; i++){
            current = current.next;
        }
        return current.data;
    }

}
