package pl.com.urbanlab.lcd;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by andrzej on 23.12.16.
 */
public class Display {
    private Map<Integer, String> digits = new HashMap();

    public Display() {

    }

    public String lcdify(int num) {

        switch (num) {
            case 0:
                return "._.\n|.|\n._.";
            case 1:
                return "...\n.|.\n.|.";
            case 2:
                return ".-.\n._|\n._.";
            case 3:
                return "._.\n._|\n._|";
            default:
                return "";
        }
    }
}
