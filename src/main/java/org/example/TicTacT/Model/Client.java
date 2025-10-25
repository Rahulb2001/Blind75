// Corrected Client.java
package org.example.TicTacT.Model;

public class Client {

    public static void main(String[] args) {

        Player player1 = new Player("Alice", 'X');
        Player player2 = new Player("Bob", 'O');
        Board board = new Board(3);

        Game game = new Game(player1, player2, board);
        View view = new View();

        GameController gameController = new GameController(game, view);
        gameController.startGame();

    }
}