package queueWithStacks;


import code401Challenges.stacksandqueues.Stack;

import java.util.EmptyStackException;

public class PseudoQueue {
    Stack stackEnq;
    Stack stackDeq;

    public PseudoQueue(){
        this.stackEnq = new Stack();
        this.stackDeq = new Stack();
    }

    public void enqueue(int value){
        stackEnq.push(value);
    }

    public int dequeue(){
        if (stackDeq.isEmpty()) {
            if (stackEnq.isEmpty()) throw new EmptyStackException();

            while (!stackEnq.isEmpty()) {
                stackDeq.push(stackEnq.pop());
            }
        }

        int tempDeq = stackDeq.pop();
        return tempDeq;
    }
}
