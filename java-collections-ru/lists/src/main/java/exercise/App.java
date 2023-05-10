package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String symbols, String word) {
        boolean answer = true;
        symbols = symbols.toLowerCase();
        word = word.toLowerCase();
        List<Character> symbolList = new ArrayList<>();
        List<Character> wordlList = new ArrayList<>();
        char[] charSymbols = symbols.toCharArray();
        char[] charWord = word.toCharArray();
        for (char ch : charWord) {
            wordlList.add(ch);
        }
        for (char ch : charSymbols) {
            symbolList.add(ch);
        }

        for (Character c : wordlList) {
            if (symbolList.contains(c)) {
                symbolList.remove(c);
            } else {
                answer = false;
                break;
            }
        }
        return answer;
    }
//END
