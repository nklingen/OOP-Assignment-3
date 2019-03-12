package OptimisedCheckersTest;

import OptimisedCheckers.Board;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    private Board board;

    @Before
    public void CreateEmptyBoard(){
        board = new Board();
    }

    @Test
    void cont() {
        String input = "q";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals(false,board.cont());
        //Quit
        input = "c";
        in = new ByteArrayInputStream((input.getBytes()));
        System.setIn(in);
        assertEquals(true,board.cont());
        //Continue
        input = "l";
        in = new ByteArrayInputStream((input.getBytes()));
        System.setIn(in);

    }


}