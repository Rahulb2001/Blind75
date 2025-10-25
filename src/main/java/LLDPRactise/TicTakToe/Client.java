package LLDPRactise.TicTakToe;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1. Get game settings from users
        System.out.print("Enter the size of the Tic-Tac-Toe board (e.g., 3 for 3x3): ");
        int size = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline character

        System.out.print("Enter the name for Player 1 (who will use 'X'): ");
        String player1Name = scanner.nextLine();

        System.out.print("Enter the name for Player 2 (who will use 'O'): ");
        String player2Name = scanner.nextLine();

        System.out.println("\nLet's start the game!");

        // 2. Create the main game components (Model-View-Controller)

        // Create the Model: It holds the game state and logic.
        Game game = new Game(size, new Player(player1Name, 'X'), new Player(player2Name, 'O'));

        // Create the View: It is responsible for displaying the game.
        View view = new View();

        // Create the Controller: It orchestrates the game by taking user input and updating the model and view.
        GameController gameController = new GameController(game, view);

        // 3. Start the game loop
        gameController.startGame(scanner);

        // 4. Close the scanner at the end of the program
        scanner.close();
    }
}