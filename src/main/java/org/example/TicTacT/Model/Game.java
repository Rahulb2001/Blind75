package org.example.TicTacT.Model;

public class Game {

    private Board board;
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private boolean isGameOver;

    public Board getBoard() {
        return board;
    }


    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public boolean isGameOver() {
        return isGameOver;
    }

    public void setGameOver(boolean gameOver) {
        isGameOver = gameOver;
    }

    public Game(Player player1Name, Player player2Name, Board board) {
        this.board = board;
        this.player1 = player1Name;
        this.player2 = player2Name;
        this.currentPlayer = this.player1;
        this.isGameOver = false;
    }

    public boolean makeMove(int row, int col) {

        boolean validMove = board.marktheplace(row, col, currentPlayer.getSymbol());

        if (validMove) {
            if (board.checkforWinner(currentPlayer.getSymbol())) {
                isGameOver = true;
                return true;
            }

            if (board.isFull()) {
                isGameOver = true;
                return false;
            }

            switchPlayer();

        }
        return false;
    }

    private void switchPlayer() {

        if (currentPlayer == player1) {
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
    }
}
