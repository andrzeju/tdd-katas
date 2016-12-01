package pl.com.urbanlab.hours;

/**
 * Created by andrzej on 01.12.16.
 */
public class HumanReadableSeconds {

    public static final String SECONDS_SUFFIX = "s";
    public static final String MINUTES_SUFFIX = "m:";
    public static final String HOURS_SUFFIX = "h:";

    public String convertSeconds(long seconds) {
        boolean minutesAndSeconds = seconds >= 60 && seconds < 3600;
        boolean hoursMinutesAndSeconds = seconds >= 3600;

        String result = "";
        if (minutesAndSeconds) {
            result = seconds / 60 + MINUTES_SUFFIX;
        }
        if (hoursMinutesAndSeconds) {
            result = seconds / 3600 + HOURS_SUFFIX + (seconds % 3600 - seconds % 60) / 60 + MINUTES_SUFFIX;
        }
        result += seconds % 60 + SECONDS_SUFFIX;
        return result;
    }
}
