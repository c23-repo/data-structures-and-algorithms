package code401Challenges.fifoAnimalShelter;

import code401Challenges.stacksandqueues.Node;
import code401Challenges.stacksandqueues.Queue;

public class AnimalShelter<T> {

    Queue<T> dogQ;
    Queue<T> catQ;

    public AnimalShelter(){
        this.dogQ = new Queue<>();
        this.catQ = new Queue<>();
    }

    public void enqueuePet(T animal) {

        if (animal.getClass() == Dog.class) {
            dogQ.enqueue(animal);
            return;
        }else {
            catQ.enqueue(animal);
            return;
        }
    }

    public T dequeuePet(T pref) {

        if (pref == Dog.class) {
            return dogQ.dequeue();
        }
        if (pref == Cat.class){
            return catQ.dequeue();
        }
        return null;
    }

}

