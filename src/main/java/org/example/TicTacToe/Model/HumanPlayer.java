package org.example.TicTacToe.Model;

import java.util.Scanner;

public class HumanPlayer extends Player{

    private Scanner scanner;




    public HumanPlayer(String name, char symbol) {
        super(name, symbol);
    }

    @Override
    public int[] makeMove(Board board) {

        System.out.println("Enter your move (row and column) for player " + getName() + " (" + getSymbol() + "): ");
        scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        return new int[]{row, col};
    }
}
