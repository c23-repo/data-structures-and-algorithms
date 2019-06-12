package code401Challenges.fifoAnimalShelter;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {

    @Test
    public void enqueue() {
        AnimalShelter classTest = new AnimalShelter();
        Dog fido = new Dog("fido");

        classTest.enqueuePet(fido);

    }
    @Test
    public void enqueueCat() {
        AnimalShelter classTest = new AnimalShelter();
        Cat whiskers = new Cat("whiskers");

        classTest.enqueuePet(whiskers);

    }

    @Test
    public void dequeueDog() {
        AnimalShelter classTest = new AnimalShelter();
        Dog fido = new Dog("fido");
        Dog otis = new Dog("otis");
        Dog maya = new Dog("maya");

        classTest.enqueuePet(fido);
        classTest.enqueuePet(otis);
        classTest.enqueuePet(maya);

        assertEquals(fido, classTest.dequeuePet(Dog.class));
    }

    @Test
    public void dequeueCat() {
        AnimalShelter classTest = new AnimalShelter();
        Cat whiskers = new Cat("whiskers");
        Cat divo = new Cat("divo");
        Cat simba = new Cat("simba");

        classTest.enqueuePet(whiskers);
        classTest.enqueuePet(divo);
        classTest.enqueuePet(simba);
        classTest.dequeuePet(Cat.class);

        assertEquals(divo, classTest.dequeuePet(Cat.class));
    }

    @Test
    public void dequeueMixed() {
        AnimalShelter classTest = new AnimalShelter();
        Cat whiskers = new Cat("whiskers");
        Cat divo = new Cat("divo");
        Cat simba = new Cat("simba");
        Dog fido = new Dog("fido");
        Dog otis = new Dog("otis");
        Dog maya = new Dog("maya");

        classTest.enqueuePet(fido);
        classTest.enqueuePet(otis);
        classTest.enqueuePet(maya);

        classTest.enqueuePet(whiskers);
        classTest.enqueuePet(divo);
        classTest.enqueuePet(simba);
        classTest.dequeuePet(Cat.class);

        assertEquals(divo, classTest.dequeuePet(Cat.class));
    }

    @Test
    public void dequeueNull() {
        AnimalShelter classTest = new AnimalShelter();
        Cat whiskers = new Cat("whiskers");
        Cat divo = new Cat("divo");
        Cat simba = new Cat("simba");

        classTest.enqueuePet(whiskers);
        classTest.enqueuePet(divo);
        classTest.enqueuePet(simba);
        classTest.dequeuePet(Cat.class);

        assertNull(classTest.dequeuePet(null));
    }
}