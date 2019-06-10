package code401Challenges.stacksandqueues;

import java.util.NoSuchElementException;

public class Queue {

    Node front;
    Node back;
    int n; //size of queue


    Queue(){
        this.front = null;
        this.back = null;
        n = 0;
    }

    public boolean isEmpty() {
        return front == null ? true : false;
    }

    public int getFront() { return front.data; }

    public int getBack() { return back.data; }

    public int getN() { return n; }

    public void enqueue(int value){
        Node newNode = new Node(value);
        if (isEmpty()) {
            front = newNode;
            back = newNode;
            n++;
            return;
        }
        back.next = newNode;
        back = newNode;
        n++;
    }

    public int dequeue(){
        if (isEmpty()){
            throw new NoSuchElementException("node in queue does not exist");
        }
        Node temp = front;
        front = front.next;
        n--;
        return temp.data;
    }

    public int peek(){
        if (isEmpty()){
            throw new NoSuchElementException("node in queue does not exist");
        }
        return front.data;
    }
}
