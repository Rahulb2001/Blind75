package LLDPRactise.TicTakToe;

public class Game {

    private final Board board;
    private final Player player1;
    private final Player player2;
    private Player currentPlayer;
    private GameStatus gameStatus;
    private Player winner;

    public Game(int size, Player player1, Player player2){
        this.board = new Board(size);
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = player1; // Player 1 always starts
        this.gameStatus = GameStatus.IN_PROGRESS;
        this.winner = null;
    }

    public void makeMove(int row, int col){
        if (!board.isValidAndEmpty(row, col)){
            System.out.println("Invalid move! The cell is either taken or out of bounds. Please try again.");
            return; // Exit the method without switching players
        }

        board.markThePlace(row, col, currentPlayer.getSymbol());

        if (board.checkWinningCondition(row, col, currentPlayer.getSymbol())) {
            this.gameStatus = GameStatus.ENDED;
            this.winner = currentPlayer;
        } else if (board.isFull()) {
            this.gameStatus = GameStatus.DRAW;
        } else {
            switchPlayer();
        }
    }

    private void switchPlayer() {
        if(this.currentPlayer == player1){
            this.currentPlayer = player2;
        } else {
            this.currentPlayer = player1;
        }
    }

    // Getters for the Controller to use
    public Board getBoard() { return board; }
    public Player getCurrentPlayer() { return currentPlayer; }
    public GameStatus getGameStatus() { return gameStatus; }
    public Player getWinner() { return winner; }
}

// Helper Enum to manage the game's state
enum GameStatus {
    IN_PROGRESS,
    ENDED,
    DRAW
}