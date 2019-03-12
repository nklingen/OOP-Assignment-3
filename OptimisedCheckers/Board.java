package OptimisedCheckers;

import java.util.Scanner;

public class Board {

    int board[][];

    protected Board(){
        this.board = new int[][]  {
                {0, 1, 0, 1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1, 0, 1, 0},
                {0, 1, 0, 1, 0, 1, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {2, 0, 2, 0, 2, 0, 2, 0},
                {0, 2, 0, 2, 0, 2, 0, 2},
                {2, 0, 2, 0, 2, 0, 2, 0},
        };
    }

    protected void printboard() {
        System.out.println("   -----------------");

        for (int r = 0; r<=7; r++) {
            System.out.print(r + " | ");
            for(int c =0; c<=7; c++) {
                if (board[r][c] == 0) {
                    System.out.print("  ");
                }
                else {
                    System.out.print(board[r][c]+" ");
                }
            }
            System.out.println("|");
        }
        System.out.println("   -----------------");
        System.out.println("    0 1 2 3 4 5 6 7");
    }

    protected static Boolean cont(){

        Scanner s = new Scanner (System.in);
        System.out.println("\nPress c to continue or q to quit: ");

        String opt = s.next();

        if(opt.equals("q")){
            return false;
        }
        else if(opt.equals("c")) {
            return true;
        }
        else {
            System.out.println("\n" + opt + " is not a valid option");
            return cont();
        }

    }

    protected void move(int[] coords, int num){
        int x_0 = coords[1];
        int y_0 = coords[0];
        int x = coords[3];
        int y = coords[2];

        board[x_0][y_0] = 0;
        board[x][y] = num;

    }
}
