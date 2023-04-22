package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
    public static boolean scrabble(String symbols, String word) {
        boolean answer = true;
        symbols = symbols.toLowerCase();
        word = word.toLowerCase();
        List<Character> symbolList = new ArrayList<>();
        char[] charSymbols = symbols.toCharArray();
        char[] charWord = word.toCharArray();
        for (char ch : charSymbols) {
            symbolList.add(ch);
        }
        for (int i = 0; i < charWord.length-1; i++) {
            if (symbolList.contains(charWord[i])) {
                symbolList.remove(i);
            } else {
                answer = false;
            }
        }
        return answer;
    }
}
//END