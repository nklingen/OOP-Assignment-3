package OptimisedCheckers;

public class main {

    public static void main(String[] args) {

        // initializes board
        Board board = new Board ();
        int[] coords;

        // creates new players each with player #.
        Player p1 = new SouthPlayer (1);
        Player p2 = new NorthPlayer (2);

        // keeps track of current player
        Player currentplayer = p1;

        // sets loop to true
        Boolean running = true;
        board.printboard ();

        // continues loop unit user prompts to exit
        while (running) {
            // enters a loop to continue prompting user for input until a valid move is entered
            coords = currentplayer.capturevalidinput(board.board);
            // moves the valid piece in the board.
            board.move (coords, currentplayer.num);
            // prints the board
            board.printboard ();
            // alternates player
            currentplayer = (currentplayer == p1) ? p2 : p1;
            // allows user to continue a new interation of the game, or exit.
            running = board.cont ();

        }
    }
}
