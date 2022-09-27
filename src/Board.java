public class Board {
    private static final String blank = "_";

    public void printBoard(String x, String y,  String currentPlayer) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("|_" + blank + "_|");
            }
            System.out.println();
        }
    }
}
