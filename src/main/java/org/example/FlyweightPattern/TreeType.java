package org.example.FlyweightPattern;

public class TreeType {

    public String name;
    public String color;
    public String texture;

    public TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }


    public void draw(int x, int y) {
        System.out.println("Drawing " + name + " tree at (" + x + "," + y + ")");
    }


}
