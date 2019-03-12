package OptimisedCheckersTest;

import OptimisedCheckers.SouthPlayer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SouthPlayerTest {

    private int[] coords;
    private int[][] board;
    private SouthPlayer player;
    @Test
    void canmove() {

        player = new SouthPlayer(2);
        coords = new int[] {5,0,4,1};
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

        coords = new int[] {2,5,3,4};
        assertTrue(player.canmove(coords,board));
    }
}