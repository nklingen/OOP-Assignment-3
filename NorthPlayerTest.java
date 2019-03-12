package OptimisedCheckersTest;

import OptimisedCheckers.NorthPlayer;
import OptimisedCheckers.Player;
import OptimisedCheckers.SouthPlayer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NorthPlayerTest {


    private int[] coords;
    private int[][] board;
    private NorthPlayer player;

    @Test
    void canmove() {

        player = new NorthPlayer(1);
        coords = new int[] {2,2,1,4};
        board = new int[][] {
                {0, 1, 0, 1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1, 0, 1, 0},
                {0, 1, 0, 1, 0, 1, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {2, 0, 2, 0, 2, 0, 2, 0},
                {0, 2, 0, 2, 0, 2, 0, 2},
                {2, 0, 2, 0, 2, 0, 2, 0},
        };
        assertFalse(player.canmove(coords,board));

        coords = new int[] {3,2,4,3};
        assertTrue(player.canmove(coords,board));
    }
}