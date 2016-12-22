package pl.com.urbanlab.bowling;

/**
 * Created by andrzej on 22.12.16.
 */
public abstract class Frame {

    final int frameIndex;
    final int[] rolls;

    public Frame(int [] rolls, int frameIndex) { //same in all classes
        this.rolls = rolls;
        this.frameIndex = frameIndex;
    }

    public abstract int score();
    public abstract int increaseIndex();
}
