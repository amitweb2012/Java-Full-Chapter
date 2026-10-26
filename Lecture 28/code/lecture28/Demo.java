package lecture28;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        // Invariant in generics
        //Animal animal = new Dog();
        // animal.eat();
        // animal.walk();

        // List<Dog> dogs = new ArrayList<>();
        // List<Animal> animals = dogs;

        Dog[] dogs = new Dog[10];
        Animal[] animals = dogs;

        animals[0] = new Dog();
        animals[1] = new Dog();
        animals[2] = new Dog();
        animals[3] = new Dog();
        try {
            animals[4] = new Animal();
        } catch (ArrayStoreException e) {
            System.out.println("A Dog[] cannot store an Animal that is not a Dog");
        }

        for(Animal animal : animals) {

            if(animal == null) {
                continue;
            }

            animal.eat();
        }

    }
}

class Animal {
    void eat() {
        System.out.println("Eating");
    }
    void walk() {
        System.out.println("Walking");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}
