package pl.com.urbanlab.hours;

/**
 * Created by andrzej on 02.12.16.
 */
public class HumanReadableParser {
    public ParsedTime parse(String timeString) {
        timeString = timeString.replaceAll(":", "").replaceAll(" ", "");
        int seconds;
        int minutes = 0;
        int hours = 0;
        if (timeString.contains("h")) {
            hours = toInt(timeString.substring(0,timeString.indexOf("h")));
            minutes = toInt(timeString.substring(timeString.indexOf("h") + 1, timeString.indexOf("m")));
            seconds = toInt(timeString.substring(timeString.indexOf("m") + 1, timeString.indexOf("s")));
        } else if (timeString.contains("m")) {
            minutes = toInt(timeString.substring(0,timeString.indexOf("m")));
            seconds = toInt(timeString.substring(timeString.indexOf("m") + 1, timeString.indexOf("s")));
        } else {
            seconds = toInt(timeString.substring(0,timeString.indexOf("s")));
        }
        return new ParsedTime(hours, minutes, seconds);
    }
    
    private int toInt(String text) {
        return Integer.parseInt(text);
    }
}
