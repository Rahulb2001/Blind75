package SnakeAndLadder;

import java.util.ArrayList;
import java.util.List;

public class Snake {

    private int start;
    private int end;

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public Snake(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public List<Snake> getsnakes(){

        List<Snake> snakes= new ArrayList<>();
        snakes.add(new Snake(12,3));
        snakes.add(new Snake(45,17));
        snakes.add(new Snake(54,25));
        snakes.add(new Snake(69,50));
        snakes.add(new Snake(83,2));
        return snakes;
    }
}
