package pl.com.urbanlab.bowling;

/**
 * Created by andrzej on 20.12.16.
 */
public class Game {

    private int [] rolls = new int[21];
    private int currentRoll = 0;

    public void roll(int pins) {
        rolls[currentRoll++] = pins;
    }

    public int score() {
        int score = 0;
        int frameIndex = 0;
        FrameFactory ff = new FrameFactory(rolls);
        for (int frameNum = 0; frameNum < 10; frameNum++) {
            Frame frame = ff.frame(frameIndex);
            score += frame.score();
            frameIndex = frame.increaseIndex();
        }
        return score;
    }


}
