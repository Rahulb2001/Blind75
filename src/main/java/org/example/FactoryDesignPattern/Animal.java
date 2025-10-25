package org.example.FactoryDesignPattern;

public class Animal implements Dog, Cat {

    private String breed;
    private int age;

    public Animal(String breed, int age) {
        this.breed = breed;
        this.age = age;
    }

    @Override
    public void bark() {
        System.out.println("Woof! Woof!");
    }

    @Override
    public void meow() {
        System.out.println("Meow! Meow!");
    }

    @Override
    public void eat() {
        System.out.println("Eating...");
    }

    @Override
    public void play() {
        System.out.println("Playing...");
    }

    @Override
    public String getBreed() {
        return breed;
    }

    @Override
    public int getAge() {
        return age;
    }
}
