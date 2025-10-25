package SnakeAndLadder;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class GameController {

    private Board board;
    private final Dice dice;
    private Deque<Player> players;
    private Player winner;

    /**
     * Constructor to set up the game.
     */
    public GameController() {
        initializeGame();
        this.dice = new Dice(1); // Initial roll value doesn't matter
    }

    /**
     * Initializes the board, players, snakes, and ladders.
     */
    private void initializeGame() {
        // Create dummy objects to access the get-list methods as they are not static
        Snake snakeProvider = new Snake(0, 0);
        List<Snake> snakes = snakeProvider.getsnakes();

        Ladder ladderProvider = new Ladder(0, 0);
        List<Ladder> ladders = ladderProvider.getLadders();

        // Initialize the board
        this.board = new Board(10, snakes, ladders); // Size 10 is not used in board logic

        // Initialize players and the turn queue
        this.winner = null;
        this.players = new LinkedList<>();
        Player player1 = new Player(1, "Alice");
        Player player2 = new Player(2, "Bob");
        players.add(player1);
        players.add(player2);
    }

    /**
     * Contains the main game loop that continues until a winner is found.
     */
    public void startGame() {
        System.out.println("---  Ladder Game Started 🪜 ---");

        while (winner == null) {
            // Get the current player whose turn it is
            Player currentPlayer = players.removeFirst();
            System.out.println("\n" + currentPlayer.getName() + "'s turn. Current Position: " + currentPlayer.getCurrentposition());

            // Roll the dice
            int diceRoll = dice.generatenumber();
            System.out.println("Dice rolled: " + diceRoll);

            // Calculate the potential new position
            int newPosition = currentPlayer.getCurrentposition() + diceRoll;

            // Handle the "win by exact roll" condition
            if (newPosition > 100) {
                System.out.println("Oops! You need to land exactly on 100. No move this turn.");
                // Add the player back to the end of the queue
                players.addLast(currentPlayer);
                continue; // End this turn
            }

            // Check for snakes at the new position
            int positionAfterSnake = board.getNewPosition(newPosition);
            if (positionAfterSnake != newPosition) {
                System.out.println("Oh no! Bitten by a snake. ");
                newPosition = positionAfterSnake;
            } else {
                // If not a snake, check for a ladder
                int positionAfterLadder = board.getLadderPoistion(newPosition);
                if (positionAfterLadder != newPosition) {
                    System.out.println("Yay! Climbed a ladder. ");
                    newPosition = positionAfterLadder;
                }
            }

            // Set the player's final new position for this turn
            currentPlayer.setCurrentposition(newPosition);
            System.out.println(currentPlayer.getName() + "'s new position is: " + currentPlayer.getCurrentposition());

            // Check for a winner
            if (currentPlayer.getCurrentposition() == 100) {
                winner = currentPlayer;
                System.out.println("\n Congratulations " + winner.getName() + "! You have won the game! ");
            } else {
                // If no winner, add the player back to the queue for their next turn
                players.addLast(currentPlayer);
            }
        }

        System.out.println("\n--- Game Over ---");
    }
}