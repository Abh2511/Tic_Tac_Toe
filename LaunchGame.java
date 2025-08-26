public class LaunchGame //Main_Class
{

        public static void main(String[] args)
        {
        TicTacToe t = new TicTacToe();

        HumanPlayer p1 = new HumanPlayer("Bob", 'X');
        //AIPlayer p2 = new AIPlayer("TAI", 'O')
        HumanPlayer p2  = new HumanPlayer("ABHIRAT",'O');

        Player cp = p1; // Bob starts
        TicTacToe.dispBoard();

        while (true) {
            System.out.println(cp.name + "'s turn:");
            cp.makeMove();
            TicTacToe.dispBoard();

            if (TicTacToe.checkRowWin() || TicTacToe.checkColWin() || TicTacToe.checkDiagWin()) {
                System.out.println(cp.name + " has won!");
                break;
            }

            if (TicTacToe.isBoardFull())
            {
                System.out.println("It's a draw!");
                break;
            }

            cp = (cp == p1) ? p2 : p1; // Switch turn
        }
    }

    }

