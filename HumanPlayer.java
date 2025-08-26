import java.util.Scanner;
import java.util.Random;
abstract class Player
{
    String name;
    char mark;

    abstract void makeMove();

    boolean isValidMove(int row, int col) {
        return row >= 0 && row <= 2 && col >= 0 && col <= 2 && TicTacToe.board[row][col] == ' ';
    }
}
public class HumanPlayer extends Player
{
    Scanner scanner = new Scanner(System.in);

    HumanPlayer(String name, char mark) {
        this.name = name;
        this.mark = mark;
    }

    void makeMove()
    {
        int row, col;
        do {
            System.out.println(name + ", enter your row and column (0-2): ");
            row = scanner.nextInt();
            col = scanner.nextInt();
        } while (!isValidMove(row, col));
        TicTacToe.placeMark(row, col, mark);
    }
}
//class AIPlayer extends Player {
//    AIPlayer(String name, char mark) {
//        this.name = name;
//        this.mark = mark;
//    }
//
//    void makeMove() {
//        Random r = new Random();
//        int row, col;
//        do {
//            row = r.nextInt(3);
//            col = r.nextInt(3);
//        } while (!isValidMove(row, col));
//        System.out.println(name + " placed at (" + row + ", " + col + ")");
//        TicTacToe.placeMark(row, col, mark);
//    }
//}
