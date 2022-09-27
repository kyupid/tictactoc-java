public class Board {
    private static final String blank = "_";
    private static final String[][] currentBoard = new String[3][3];

    public void initBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                currentBoard[i][j] = blank;
            }
        }
        printBoard();
    }
    public void printBoard(int x, int y,  String currentPlayer) {
        String target = "";
        currentBoard[x][y] = currentPlayer;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("|_" + currentBoard[i][j] + "_|");
            }
            System.out.println();
        }
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
