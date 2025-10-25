package LLDPRactise.TicTakToe;

import java.util.Arrays;

public class Board {

    private final int size;
    private final char[][] cell;

    public Board(int size){
        this.size = size;
        this.cell = new char[size][size]; // FIX: Memory must be allocated
        for (char[] row : cell) {
            Arrays.fill(row, '-'); // Initialize board with '-'
        }
    }

    public boolean isValidAndEmpty(int row, int col){
        return row >= 0 && row < size && col >= 0 && col < size && cell[row][col] == '-';
    }

    public boolean checkWinningCondition(int row, int col, char symbol){
        // Check row
        boolean rowWin = true;
        for(int j = 0; j < size; j++){
            if(cell[row][j] != symbol) {
                rowWin = false;
                break;
            }
        }
        if (rowWin) return true;

        // Check column
        boolean colWin = true;
        for(int i = 0; i < size; i++){
            if(cell[i][col] != symbol) {
                colWin = false;
                break;
            }
        }
        if (colWin) return true;

        // Check main diagonal (if move is on it)
        if(row == col){
            boolean mainDiagWin = true;
            for(int i = 0; i < size; i++){
                if(cell[i][i] != symbol) {
                    mainDiagWin = false;
                    break;
                }
            }
            if (mainDiagWin) return true;
        }

        // Check anti-diagonal (if move is on it)
        if(row + col == size - 1){
            boolean antiDiagWin = true;
            for(int i = 0; i < size; i++){
                if(cell[i][size - 1 - i] != symbol) {
                    antiDiagWin = false;
                    break;
                }
            }
            if (antiDiagWin) return true;
        }

        return false;
    }

    public void markThePlace(int row, int col, char symbol){
        if(row >= 0 && row < size && col >= 0 && col < size){
            cell[row][col] = symbol;
        }
    }

    public boolean isFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (cell[i][j] == '-') {
                    return false; // Found an empty cell
                }
            }
        }
        return true; // No empty cells found
    }

    public int getSize() { return size; }
    public char[][] getCell() { return cell; }
}