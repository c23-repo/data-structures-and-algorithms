package queueWithStacks;


import code401Challenges.stacksandqueues.Stack;

import java.util.EmptyStackException;

public class PseudoQueue<T> {
    Stack<T> stackEnq;
    Stack<T> stackDeq;

    public PseudoQueue(){
        this.stackEnq = new Stack();
        this.stackDeq = new Stack();
    }

    public void enqueue(T value){
        stackEnq.push(value);
    }

    public T dequeue(){
        if (stackDeq.isEmpty()) {
            if (stackEnq.isEmpty()) throw new EmptyStackException();

            while (!stackEnq.isEmpty()) {
                stackDeq.push(stackEnq.pop());
            }
        }

        T tempDeq = stackDeq.pop();
        return tempDeq;
    }
}
