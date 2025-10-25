package org.example.TicTacT.Model;

public class View {

    public void display(Board board){

        for(int i=0;i<board.getSize();i++){
            for(int j=0;j<board.getSize();j++){
                System.out.print(board.getcell(i,j)+" ");
            }
            System.out.println();
        }
    }
}
