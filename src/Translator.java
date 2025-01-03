import java.util.HashMap;
import java.util.Map;

public class Translator {

    HashMap<Integer, String> numericAlpha = new HashMap<>();

    public Translator(String[] aplhabetic, Integer[] numeric) {

        for (int i = 0; i < aplhabetic.length; i++) {
            numericAlpha.put(numeric[i], aplhabetic[i]);
        }
    }

    public String translate(Integer number) {
        return numericAlpha.get(number);
    }
}
