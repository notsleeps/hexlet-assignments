package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
public class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where) {
        List<Map<String, String>> match = new ArrayList<>();
        for (Map<String, String> book : books) {
            if (book.keySet().containsAll(where.keySet()) && book.values().containsAll(where.values())) {
                match.add(book);
            }
        }
        System.out.println(match);
        return match;
        }
}
//END
