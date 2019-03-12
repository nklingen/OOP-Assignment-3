package OptimisedCheckers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Player {

    protected int num;

    Player(int i){
        num = i;
    }

    protected int[] capturevalidinput(int[][] board){

        int[] coords = getinput();
        Boolean invalidinput = true;
        while (invalidinput) {
            // checks if a player can make a given move. If so, exits the loop.
            if (canmove (coords, board)) {
                invalidinput = false;

            }
            else{
                // If not, notifies player of invalid move, prompts for new desired move, and continues in loop
                System.out.println ("\n--- Invalid move Player " + num + " ----");
                coords = getinput ();
            }
        }
        return coords;
    }

    protected int[] getinput() {

        System.out.println("\nPlayer " + num + "'s turn !\n\nCoordinate of piece to move:");
        System.out.print ("   Enter X: ");
        int x_0 = validateinput();

        System.out.print("   Enter Y: ");
        int y_0 = validateinput();

        System.out.println("\nCoordinate of new position:");

        System.out.print("   Enter X: ");
        int x = validateinput();

        System.out.print("   Enter Y: ");
        int y = validateinput();

        int[] coords = new int[4];
        coords[0] = x_0;
        coords[1] = y_0;
        coords[2] = x;
        coords[3] = y;
        return coords;
    }

    protected int validateinput() {
        Scanner s = new Scanner(System.in);
        while(true){
            try{
                return s.nextInt();
            }
            catch (InputMismatchException e){
                System.out.print ("\nInvalid input - must be an integer !\n\nPlease re-enter:");
                return validateinput ();
            }
        }
    }

    protected Boolean canmove(int[] coords, int[][] board){
        int x_0 = coords[1];
        int y_0 = coords[0];
        int x = coords[3];
        int y = coords[2];

        if(x>=0 && x<=7 && y>=0 && y<=7) {
            if(x_0>=0 && x_0<=7 && y_0>=0 && y_0<=7){
                if(board[x_0][y_0] == num) {
                    if(board[x][y] == 0) {
                        return true;
                    }
                    else{
                        System.out.println ("This cell is already occupied by your piece !");
                        return false;
                    }
                }
                else {
                    System.out.println("Player " + num + " does not have a checker at position (" + coords[0] +  "," + coords[1] + ")!");
                    return false;
                }
            }
            else {
                System.out.println("The initial coordinate (" + coords[0] + "," + coords[1] + ") is not a valid coordinate !");
                return false;
            }
        }
        else {
            System.out.println("The new coordinate (" + coords[2] + "," + coords[3] + ") is not a valid coordinate !");
            return false;
        }

    }

}
