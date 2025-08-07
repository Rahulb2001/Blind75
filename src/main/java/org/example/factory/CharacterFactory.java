package org.example.factory;

public class CharacterFactory {

    public static Character createCharacter(String type) {
        switch (type.toLowerCase()) {
            case "king":
                return new King();
            case "queen":
                return new queen();
            case "people":
                return new People();
            default:
                throw new IllegalArgumentException("Unknown character type: " + type);
        }
    }
}
