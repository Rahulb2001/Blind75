package SnakeAndLadder;

public class Player {

    private int id;
    private String name;
    private int currentposition;

    public Player(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentposition() {
        return currentposition;
    }

    public void setCurrentposition(int currentposition) {
        this.currentposition = currentposition;
    }


}
