package pl.com.urbanlab.hours;

/**
 * Created by andrzej on 02.12.16.
 */
public class ParsedTime {
    private final int hours;
    private final int minutes;
    private final int seconds;

    public ParsedTime(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
   }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ParsedTime that = (ParsedTime) o;

        if (hours != that.hours) return false;
        if (minutes != that.minutes) return false;
        return seconds == that.seconds;

    }

    @Override
    public int hashCode() {
        int result = hours;
        result = 31 * result + minutes;
        result = 31 * result + seconds;
        return result;
    }

    @Override
    public String toString() {
        return "ParsedTime{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }
}
