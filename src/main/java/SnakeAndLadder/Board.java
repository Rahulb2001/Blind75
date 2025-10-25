package SnakeAndLadder;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private char[][] cells;
    List<Snake> snakes;
    List<Ladder> ladders;
    private Snake snake;
    private Ladder ladder;

    public Board(int size,List<Snake> snakes,List<Ladder> ladders) {
        this.cells = new char[10][10];
        this.snakes = snakes;
        this.ladders = ladders;
    }


   public int getNewPosition(int currentpos){

        for(Snake snake:snakes){
            if(snake.getStart()==currentpos){
                System.out.println("snake");
                return snake.getEnd();
            }
        }

        return currentpos;
   }

   public int getLadderPoistion(int currentpos){

        for(Ladder ladder:ladders){

            if(ladder.getStart()==currentpos){
                System.out.println("ladder");
                return ladder.getEnd();
            }
        }
        return currentpos;
   }

   public int winningCondition(int currentpos){

        if(currentpos==100){
            System.out.println("won the game");
            return currentpos;
        }

        if(currentpos > 100){
            return currentpos;
        }

        return currentpos;

   }
}
