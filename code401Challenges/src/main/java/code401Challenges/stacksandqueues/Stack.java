package code401Challenges.stacksandqueues;

import java.util.NoSuchElementException;

public class Stack<T> {

    Node<T> top;
    int n; //size of the stack


    public Stack(){
        top = null;
        n = 0;
    }

    //Helper to check if its empty
    public boolean isEmpty() {
        return top == null;
    }

    public int getN() {
        return n;
    }

    public void push(T value){
        Node<T> oldTop = top;
        top = new Node(value);
        top.next = oldTop;
        n++;
    }

    public T pop(){
        if (isEmpty()){
            throw new NoSuchElementException("Stack is empty");
        }

        T answer = top.data;
        top = top.next;
        n--;
        return answer;
    }

    public T peek(){
        if (isEmpty()){
            throw new NoSuchElementException("Stack is empty");
        }

        return top.data;
    }

}
