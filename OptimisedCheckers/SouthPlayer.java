package OptimisedCheckers;

public class SouthPlayer extends Player {

    SouthPlayer(int i) {
        super (i);
    }

    protected Boolean canmove(int[] coords, int[][] board) {

        int x_0 = coords[1];
        int y_0 = coords[0];
        int x = coords[3];
        int y = coords[2];

        if (super.canmove (coords, board)) {
            if (num == 1 && (x == x_0 + 1) && ((y == y_0 + 1) || (y == y_0 - 1))) {
                return true;
            } else {
                System.out.println ("This is an invalid move. A piece can only move one square diagonally forward.");
                return false;
            }
        }
        return false;
    }
}



