package pl.com.urbanlab.bowling;

/**
 * Created by andrzej on 22.12.16.
 */
public class SpareFrame extends Frame {

    public SpareFrame(int[] rolls, int frameIndex) {
        super(rolls, frameIndex);
    }

    public int score() {
        return 10 + spareBonus(rolls[frameIndex + 2]);
    }

    public int increaseIndex() {
        return frameIndex + 2;
    }

    private int spareBonus(int roll) {
        return roll;
    }

}
