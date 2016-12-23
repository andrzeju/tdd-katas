package pl.com.urbanlab.lcd;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by andrzej on 23.12.16.
 */
public class Display {
    private Map<Integer, String> digits = new HashMap();

    public Display() {
        digits.put(0, "._.\n|.|\n._.");
        digits.put(1, "...\n.|.\n.|.");
        digits.put(2, ".-.\n._|\n|_.");
        digits.put(3, "._.\n._|\n._|");
        digits.put(4, "...\n|_|\n..|");
        digits.put(5, "._.\n|_.\n._|");
        digits.put(6, "._.\n|_.\n|_|");
        digits.put(7, "._.\n..|\n..|");
        digits.put(8, "._.\n|_|\n|_|");
        digits.put(9, "._.\n|_|\n|_.");
    }

    public String lcdify(Integer num) {
        String digitString = "";
        String [] numberDigits = num.toString().split("");
        for (int i=0; i<numberDigits.length; i++) {
            digitString+=digits.get(Integer.valueOf(numberDigits[i]));
            if (i != numberDigits.length -1) {
                digitString += "\n";
            }
        }
        return digitString;
    }
}
