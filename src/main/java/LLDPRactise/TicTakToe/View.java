package LLDPRactise.TicTakToe;

public class View {

    public void displayBoard(Board board) {
        System.out.println("\nCurrent Board State:");
        int size = board.getSize();
        char[][] cell = board.getCell();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(" " + cell[i][j] + " ");
                if (j < size - 1) System.out.print("|");
            }
            System.out.println();
            if (i < size - 1) {
                for (int k = 0; k < size; k++) {
                    System.out.print("---");
                    if (k < size - 1) System.out.print("+");
                }
                System.out.println();
            }
        }
        System.out.println();
    }
}