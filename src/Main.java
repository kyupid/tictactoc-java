import java.util.Scanner;

public class Main {

    private static String currentPlayer = "";
    private static final String player1 = "X";
    private static final String player2 = "O";

    public static void main(String[] args) {
        Board board = new Board();
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String y = sc.nextLine();
        String player = "";
        if (currentPlayer.equals(player1)) {
            currentPlayer = player2;
         } else {
            currentPlayer = player1;
        }
        board.printBoard(x, y, currentPlayer);
    }
}
