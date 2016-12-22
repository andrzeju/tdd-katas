package pl.com.urbanlab.bowling;

/**
 * Created by andrzej on 22.12.16.
 */
public class FrameFactory {

    private int [] rolls;

    public FrameFactory(int [] rolls) {
        this.rolls = rolls;
    }

    public Frame frame(int frameIndex) {
        if (isStrike(frameIndex)) {
            return new StrikeFrame(rolls, frameIndex);
        } else if(isSpare(frameIndex)) {
            return new SpareFrame(rolls, frameIndex);
        } else return new NormalFrame(rolls, frameIndex);
    }

    private boolean isStrike(int frameIndex) {
        return rolls[frameIndex] == 10;
    }

    private boolean isSpare(int frameIndex) {
        return rolls[frameIndex] + rolls[frameIndex+1] == 10;
    }
}
