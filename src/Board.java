public class Board {
    private static final String BLANK = "_";
    private static final String[][] currentBoard = new String[3][3];

    private int moveCount;

    private static final int BOARD_LENGTH = 3;

    public void initBoard() {
        for (int i = 0; i < BOARD_LENGTH; i++) {
            for (int j = 0; j < BOARD_LENGTH; j++) {
                currentBoard[i][j] = BLANK;
            }
        }
        printBoard();
    }
    public void printBoard(int x, int y,  String currentPlayer) {
        currentBoard[x][y] = currentPlayer;
        for (int i = 0; i < BOARD_LENGTH; i++) {
            for (int j = 0; j < BOARD_LENGTH; j++) {
                System.out.print("|_" + currentBoard[i][j] + "_|");
            }
            System.out.println();
        }
    }

    public void move(int x, int y, String currentPlayer) {
        // 1. check end condition

        // 2. check col

        // 3. check row

        // 4. check diag

        // 5. check anti-diag

        // 6. check draw
    }

    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("|_" + currentBoard[i][j] + "_|");
            }
            System.out.println();
        }
    }
}
