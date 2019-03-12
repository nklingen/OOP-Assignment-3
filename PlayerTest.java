package OptimisedCheckersTest;

import OptimisedCheckers.Player;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    private int[][] board;
    private int[] coords;
    private Player player1;
    private Player player2;

    @Test
    void validateinput() {
        player1 = new Player(1);
        String input = "A";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        fail("Wrong input, integer was expected");
    }

    @Test
    void canmove() {
        player1 = new Player(1);
        this.board = new int[][] {
                {0, 1, 0, 1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1, 0, 1, 0},
                {0, 1, 0, 1, 0, 1, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {2, 0, 2, 0, 2, 0, 2, 0},
                {0, 2, 0, 2, 0, 2, 0, 2},
                {2, 0, 2, 0, 2, 0, 2, 0},
        };
        this.coords = new int[] {1,2,0,3};
        assertEquals(true,player1.canmove(coords,board));
    }
}