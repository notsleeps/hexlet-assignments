package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        Map<String, Integer> map = new HashMap<>();
        if (sentence.length() != 0) {
            String[] strArray = sentence.split(" ");
            for (String s : strArray) {
                if (!map.containsKey(s)) {
                    map.put(s, 1);
                } else {
                    int value = map.get(s);
                    map.put(s, value + 1);
                }
            }
        }
        return map;
    }

    public static String toString(Map<String, Integer> mymap) {
        if (mymap.size() > 0) {
            StringBuffer sb = new StringBuffer("{\n");
            for (Map.Entry<String, Integer> entry : mymap.entrySet()) {
                sb.append("  " + entry.getKey() + ": " + entry.getValue() + "\n");
            }
            sb.append("}");
            return sb.toString();
        }
        else { return "{}";}
    }
    }
//END
