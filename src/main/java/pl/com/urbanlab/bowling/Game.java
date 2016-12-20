package pl.com.urbanlab.bowling;

/**
 * Created by andrzej on 20.12.16.
 */
public class Game {

    private int score = 0;

    public void roll(int pins) {
        score += pins;
    }

    public int score() {
        return score;
    }
}
