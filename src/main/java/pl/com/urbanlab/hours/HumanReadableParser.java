package pl.com.urbanlab.hours;

/**
 * Created by andrzej on 02.12.16.
 */
public class HumanReadableParser {
    public ParsedTime parse(String timeString) {
        timeString = timeString.replaceAll(":", "").replaceAll(" ", "");
        ParsedTime result = null;
        if (timeString.contains("h")) {
            int hours = Integer.parseInt(timeString.substring(0,timeString.indexOf("h")));
            int minutes = Integer.parseInt(timeString.substring(timeString.indexOf("h") + 1, timeString.indexOf("m")));
            int seconds = Integer.parseInt(timeString.substring(timeString.indexOf("m") + 1, timeString.indexOf("s")));
            return new ParsedTime(hours, minutes, seconds);
        } else if (timeString.contains("m")) {
            int minutes = Integer.parseInt(timeString.substring(0,timeString.indexOf("m")));
            int seconds = Integer.parseInt(timeString.substring(timeString.indexOf("m") + 1, timeString.indexOf("s")));
            result = new ParsedTime(0,minutes, seconds);
        } else {
            result = new ParsedTime(0,0,Integer.parseInt(timeString.substring(0,timeString.indexOf("s"))));
        }
        return result;
    }
}
