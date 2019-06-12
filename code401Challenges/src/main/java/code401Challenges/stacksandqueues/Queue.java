package code401Challenges.stacksandqueues;

import java.util.NoSuchElementException;

public class Queue<T> {

    Node<T> front;
    Node<T> back;
    int n; //size of queue


    public Queue(){
        this.front = null;
        this.back = null;
        n = 0;
    }

    public boolean isEmpty() {
        return front == null ? true : false;
    }

    public T getFront() { return front.data; }

    public T getBack() { return back.data; }

    public int getN() { return n; }

    public void enqueue(T value){
        Node<T> newNode = new Node(value);
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

    public T dequeue(){
        if (isEmpty()){
            throw new NoSuchElementException("node in queue does not exist");
        }
        Node<T> temp = front;
        front = front.next;
        n--;
        return temp.data;
    }

    public T peek(){
        if (isEmpty()){
            throw new NoSuchElementException("node in queue does not exist");
        }
        return front.data;
    }
}
