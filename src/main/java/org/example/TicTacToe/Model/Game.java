package org.example.TicTacToe.Model;

public class Game {
    private Board board;
    private Player[] players;
    private int currentPlayerIndex;

    public Game(Player player1, Player player2) {
        this.board = new Board(3);
        this.players = new Player[]{player1, player2};
        this.currentPlayerIndex = 0;
    }

    public void play() {
        System.out.println("Tic Tac Toe Game Started!");
        board.displayBoard();

        while (true) {
            Player currentPlayer = players[currentPlayerIndex];
            System.out.println(currentPlayer.getName() + "'s turn (" + currentPlayer.getSymbol() + ")");

            int[] move = currentPlayer.makeMove(board);
            int row = move[0];
            int col = move[1];

            if (board.makeMove(row, col, currentPlayer.getSymbol())) {
                board.displayBoard();

                if (board.checkWinner(row, col, currentPlayer.getSymbol())) {
                    System.out.println(currentPlayer.getName() + " wins!");
                    break;
                }

                if (board.isFull()) {
                    System.out.println("It's a draw!");
                    break;
                }

                // Switch player
                currentPlayerIndex = (currentPlayerIndex + 1) % 2;
            } else {
                System.out.println("Invalid move! Try again.");
            }
        }
    }
}
