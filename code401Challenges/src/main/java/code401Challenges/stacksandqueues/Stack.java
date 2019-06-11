package code401Challenges.stacksandqueues;

import java.util.NoSuchElementException;

public class Stack {

    Node top;
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

    public void push(int value){
        Node oldTop = top;
        top = new Node(value);
        top.next = oldTop;
        n++;
    }

    public int pop(){
        if (isEmpty()){
            throw new NoSuchElementException("Stack is empty");
        }

        int answer = top.data;
        top = top.next;
        n--;
        return answer;
    }

    public int peek(){
        if (isEmpty()){
            throw new NoSuchElementException("Stack is empty");
        }

        return top.data;
    }

}
