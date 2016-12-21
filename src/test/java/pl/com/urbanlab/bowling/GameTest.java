package pl.com.urbanlab.bowling;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by andrzej on 20.12.16.
 */
public class GameTest {

    private Game game;

    @Before
    public void setUp() {
        game = new Game();
    }

    @Test
    public void testGame() {
        rollMany(20, 0);
        assertEquals(0, game.score());
    }

    @Test
    public void testAllOnes() {
        rollMany(20, 1);
        assertEquals(20, game.score());
    }

    @Test
    public void testOneSpare() {
        game.roll(5);
        game.roll(5);
        game.roll(3);
        rollMany(17, 0);
        assertEquals(16, game.score());
    }


    private void rollMany(int rolls, int pins) {
        for (int i=0; i<rolls; i++) {
            game.roll(pins);
        }
    }
}