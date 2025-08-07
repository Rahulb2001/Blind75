package org.example.factory;

public class People implements Character{

    @Override
    public void speak() {
        System.out.println("People: I am a citizen of this kingdom, and I have my own voice!");
    }
}
