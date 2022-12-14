import java.util.Scanner;

public class Main {

    private static String currentPlayer = "";
    private static final String player1 = "X";
    private static final String player2 = "O";

    public static void main(String[] args) {
        Board board = new Board();
        board.initBoard();
        Scanner sc = new Scanner(System.in);

        while (true) {
            String strY = sc.nextLine();
            String strX = sc.nextLine();
            if (currentPlayer.equals(player1)) {
                currentPlayer = player2;
            } else {
                currentPlayer = player1;
            }
            int x = Integer.parseInt(strX);
            int y = Integer.parseInt(strY);
            board.move(x - 1, y - 1, currentPlayer);
        }
    }
}
