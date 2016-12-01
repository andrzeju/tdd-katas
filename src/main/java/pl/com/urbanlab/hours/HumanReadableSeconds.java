package pl.com.urbanlab.hours;

/**
 * Created by andrzej on 01.12.16.
 */
public class HumanReadableSeconds {
    public String convertSeconds(long seconds) {
        if (seconds < 60) {
            return seconds + "s";
        }
        if (seconds < 3600) {
            return seconds / 60 + "m:" + seconds % 60 + "s";
        }
        return seconds / 3600 + "h:" + (seconds % 3600 - seconds % 60) / 60 + "m:" + seconds % 60 + "s";
    }
}
