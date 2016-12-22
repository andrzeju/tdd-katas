package pl.com.urbanlab.bowling;

/**
 * Created by andrzej on 22.12.16.
 */
public class NormalFrame extends Frame {

    public NormalFrame(int[] rolls, int frameIndex) {
        super(rolls, frameIndex);
    }

    public int score() {
        return sumOfBallsInFrame(frameIndex);
    }

    public int increaseIndex() {
        return frameIndex + 2;
    }

    private int sumOfBallsInFrame(int frameIndex) {
        return rolls[frameIndex] + rolls[frameIndex+1];
    }

}
