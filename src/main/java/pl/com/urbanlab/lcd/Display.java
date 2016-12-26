package pl.com.urbanlab.lcd;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by andrzej on 23.12.16.
 */
public class Display {
    private Map<Integer, String []> digits = new HashMap();

    public Display() {
        digits.put(0, new String[] {"._.", "|.|", "._."});
        digits.put(1, new String[] {"...", ".|.", ".|."});
        digits.put(2, new String[] {".-.", "._|", "|_."});
        digits.put(3, new String[] {"._.", "._|", "._|"});
        digits.put(4, new String[] {"...", "|_|", "..|"});
        digits.put(5, new String[] {"._.", "|_.", "._|"});
        digits.put(6, new String[] {"._.", "|_.", "|_|"});
        digits.put(7, new String[] {"._.", "..|", "..|"});
        digits.put(8, new String[] {"._.", "|_|", "|_|"});
        digits.put(9, new String[] {"._.", "|_|", "|_."});
    }

    public String lcdify(Integer num) {
        String [] digitString = new String [] {"", "", ""};
        String [] numberDigits = num.toString().split("");
        for (int i=0; i<numberDigits.length; i++) {
            String [] digitRepresenation = digits.get(Integer.valueOf(numberDigits[i]));
            digitString[0] += digitRepresenation[0];
            digitString[1] += digitRepresenation[1];
            digitString[2] += digitRepresenation[2];
            if(i != numberDigits.length -1) {
                digitString[0] += " ";
                digitString[1] += " ";
                digitString[2] += " ";
            }
        }
        return digitString[0] + "\n" + digitString[1] + "\n" + digitString[2];
    }
}
