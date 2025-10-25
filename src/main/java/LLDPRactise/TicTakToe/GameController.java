package LLDPRactise.TicTakToe;

import java.util.Scanner;

public class GameController {

    private final Game game;
    private final View view;

    public GameController(Game game, View view){
        this.game = game;
        this.view = view;
    }

    public void startGame(Scanner scanner){
        System.out.println("--- Welcome to Tic-Tac-Toe! ---");

        while (game.getGameStatus() == GameStatus.IN_PROGRESS){
            view.displayBoard(game.getBoard());

            Player currentPlayer = game.getCurrentPlayer();
            System.out.print("Player '" + currentPlayer.getName() + "' (" + currentPlayer.getSymbol() + "), enter your move (row and column): ");

            try {
                int row = scanner.nextInt();
                int col = scanner.nextInt();

                game.makeMove(row, col);

            } catch (Exception e) {
                System.out.println("Invalid input! Please enter numbers for the row and column.");
                scanner.nextLine(); // Clear the invalid input from the scanner
            }
        }

        // Display the final board
        view.displayBoard(game.getBoard());

        // Announce the result
        if (game.getGameStatus() == GameStatus.ENDED) {
            System.out.println("Congratulations " + game.getWinner().getName() + "! You have won!");
        } else if (game.getGameStatus() == GameStatus.DRAW) {
            System.out.println("The game is a draw!");
        }
    }
}