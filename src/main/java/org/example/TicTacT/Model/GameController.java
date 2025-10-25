// Corrected GameController.java
package org.example.TicTacT.Model;

import java.util.Scanner;

public class GameController {
    private Game game;
    private View view;
    private Scanner scanner;

    public GameController(Game game, View view) {
        this.game = game;
        this.view = view;
        this.scanner = new Scanner(System.in);
    }

    public void startGame() {
        System.out.println("Welcome to Tic Tac Toe!");

        while (!game.isGameOver()) {
            view.display(game.getBoard());
            System.out.println("Player " + game.getCurrentPlayer().getName() + "'s turn. Enter your move (row and column): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            boolean moveMade = game.makeMove(row, col);
            if (!moveMade) {
                System.out.println("Invalid move. Please try again.");
            }
        }

        view.display(game.getBoard());

        if (game.getBoard().checkforWinner(game.getCurrentPlayer().getSymbol())) {
            System.out.println("Congratulations, " + game.getCurrentPlayer().getName() + " wins!");
        } else {
            System.out.println("The game is a draw!");
        }

        scanner.close();
    }
}