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

    private void printBoard(int x, int y, String currentPlayer) {
        currentBoard[x][y] = currentPlayer;
        for (int i = 0; i < BOARD_LENGTH; i++) {
            for (int j = 0; j < BOARD_LENGTH; j++) {
                System.out.print("|_" + currentBoard[i][j] + "_|");
            }
            System.out.println();
        }
    }

    public void move(int x, int y, String currentPlayer) {
        if (currentBoard[x][y].equals(BLANK)) {
            currentBoard[x][y] = currentPlayer;
        }
        moveCount++;

        // check end condition

        // 2. check col

        // 3. check row
        for (int i = 0; i < BOARD_LENGTH; i++) {
            if (!currentBoard[x][i].equals(currentPlayer)){
                System.out.println("currentBoard[x][i]: " + currentBoard[x][i]);
                System.out.println("currentPlayer: " + currentPlayer);
                break;
            }
            if (i == BOARD_LENGTH - 1) {
                //report win for s
                System.out.println("win");
            }
        }
        // 4. check diag
        // 5. check anti-diag
        // 6. check draw

        printBoard(x, y, currentPlayer);
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
