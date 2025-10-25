package SnakeAndLadder;

import java.util.ArrayList;
import java.util.List;

public class Ladder {

    private int start;
    private int end;

    public Ladder(int start, int end) {
        this.start = start;
        this.end = end;
    }

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

    List<Ladder> getLadders(){
        List<Ladder> ladders=new ArrayList<>();

        ladders.add(new Ladder(5,15));
        ladders.add(new Ladder(15,55));
        ladders.add(new Ladder(25,75));
        ladders.add(new Ladder(55,95));

        return ladders;
    }
}
