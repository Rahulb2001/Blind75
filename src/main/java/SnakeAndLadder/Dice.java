package SnakeAndLadder;

public class Dice {

    private int roll;

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }


    public Dice(int roll) {
        this.roll = roll;
    }

    public int generatenumber(){
        return (int)(Math.random()*6)+1;
    }

}
