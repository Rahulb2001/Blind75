package org.example.FactoryDesignPattern;

public class FactoryAnimal {

    public static Animal createAnimal(String type, String breed, int age) {
        if (type.equalsIgnoreCase("dog")) {
            return new Animal(breed, age) {
                @Override
                public void bark() {
                    System.out.println("Woof! Woof!");
                }
            };
        } else if (type.equalsIgnoreCase("cat")) {
            return new Animal(breed, age) {
                @Override
                public void meow() {
                    System.out.println("Meow! Meow!");
                }
            };
        } else {
            throw new IllegalArgumentException("Unknown animal type: " + type);
        }
    }
}
