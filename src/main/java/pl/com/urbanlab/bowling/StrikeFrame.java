package pl.com.urbanlab.bowling;

/**
 * Created by andrzej on 22.12.16.
 */
public class StrikeFrame extends Frame {

    public StrikeFrame(int[] rolls, int frameIndex) {
        super(rolls, frameIndex);
    }

    public int score() {
        return 10 + strikeBonus(frameIndex);
    }

    public int increaseIndex() {
        return frameIndex + 1;
    }

    private int strikeBonus(int frameIndex) {
        return rolls[frameIndex + 1] + rolls[frameIndex + 2];
    }

}
