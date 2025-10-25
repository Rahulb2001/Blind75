package FlyWeight;

public class TreeType {

    private String color;
    private String name;
    private int length;


    public TreeType(String color, String name, int length) {
        this.color = color;
        this.name = name;
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
