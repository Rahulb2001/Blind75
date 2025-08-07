package org.example.factory;

public class Client {
    public static void main(String[] args) {

        Character king = CharacterFactory.createCharacter("king");
        king.speak();

        Character queen = CharacterFactory.createCharacter("queen");
        queen.speak();

        Character people = CharacterFactory.createCharacter("people");
        people.speak();


//         Character unknown = CharacterFactory.createCharacter("unknown");
//         unknown.speak();

    }
}
