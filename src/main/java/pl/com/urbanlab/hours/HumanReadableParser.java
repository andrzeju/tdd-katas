package pl.com.urbanlab.hours;

/**
 * Created by andrzej on 02.12.16.
 */
public class HumanReadableParser {
    public ParsedTime parse(String timeString) {
        return new ParsedTime(0,0,Integer.parseInt(timeString.substring(0,timeString.indexOf("s"))));
    }
}
