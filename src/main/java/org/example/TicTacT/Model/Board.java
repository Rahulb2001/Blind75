package org.example.TicTacT.Model;

public class Board {

    private char[][] grid;
    private final int size;


    public int getSize() {
        return size;
    }

    // Constructor


    public Board(int size) {

        this.grid = new char[size][size];

        for (int i = 0; i < size; i++) {


            for (int j = 0; j < size; j++) {
                grid[i][j] = '_';
            }
        }
        this.size = size;
    }

    public boolean marktheplace(int row, int col, char symbol) {

        if (row >= 0 && row < size && col >= 0 && col < size && grid[row][col] == '_') {
            grid[row][col] = symbol;
            return true;
        }
        return false;
    }

    public char getcell(int row, int col) {
        return grid[row][col];
    }


    public boolean checkforWinner(char symbol) {

        for (int i = 0; i < size; i++) {
            boolean wins = true;
            for (int j = 0; j < size; j++) {

                if (grid[i][j] != symbol) {
                    wins = false;
                    break;
                }
            }
            if (wins) {
                return true;
            }
        }

        for (int j = 0; j < size; j++) {

            boolean wins = true;
            for (int i = 0; i < size; i++) {

                if (grid[i][j] != symbol) {
                    wins = false;
                    break;
                }
            }
            if (wins) {
                return true;
            }
        }

        boolean wins = true;
        for (int i = 0; i < size; i++) {
            if (grid[i][i] != symbol) {
                wins = false;
                break;
            }
        }
        if (wins) {
            return true;
        }

        wins = true;
        for (int i = 0; i < size; i++) {
            if (grid[i][size - 1 - i] != symbol) {
                wins = false;
                break;
            }
        }
        if (wins) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (grid[i][j] == '_') {
                    return false;
                }
            }
        }
        return true;
    }
}
