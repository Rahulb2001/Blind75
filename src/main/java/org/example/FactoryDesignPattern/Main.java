package org.example.FactoryDesignPattern;

public class Main {

    public static void main(String[] args) {
        Animal dog = FactoryAnimal.createAnimal("dog", "Labrador", 5);
        dog.eat();
        dog.play();
        dog.bark();
        System.out.println("Dog Breed: " + dog.getBreed() + ", Age: " + dog.getAge());

        Animal cat = FactoryAnimal.createAnimal("cat", "Siamese", 3);
        cat.eat();
        cat.play();
        cat.meow();
        System.out.println("Cat Breed: " + cat.getBreed() + ", Age: " + cat.getAge());
    }
}
