package org.example.TicTacToe.Model;

public class Board {
    private char[][] grid;
    private int size;

    public Board(int size) {
        this.size = size;
        this.grid = new char[size][size];
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = '-'; // Empty cell
            }
        }
    }

    public boolean makeMove(int row, int col, char symbol) {
        if (isValidMove(row, col)) {
            grid[row][col] = symbol;
            return true;
        }
        return false;
    }

    public boolean isValidMove(int row, int col) {
        return row >= 0 && row < size && col >= 0 && col < size && grid[row][col] == '-';
    }

    public boolean isFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (grid[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkWinner(int row, int col, char symbol) {
        // Check row
        if (grid[row][0] == symbol && grid[row][1] == symbol && grid[row][2] == symbol)
            return true;

        // Check column
        if (grid[0][col] == symbol && grid[1][col] == symbol && grid[2][col] == symbol)
            return true;

        // Check diagonals
        if (row == col && grid[0][0] == symbol && grid[1][1] == symbol && grid[2][2] == symbol)
            return true;

        if (row + col == 2 && grid[0][2] == symbol && grid[1][1] == symbol && grid[2][0] == symbol)
            return true;

        return false;
    }

    public void displayBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}