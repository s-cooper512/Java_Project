package domain;

import java.util.List;
import java.util.stream.Collectors;

public class WordFinder {
    public static List<Word> findWordByName (String userInput) {
        return (WordInitializer.activeDictionary.stream().filter(word -> word.getWordName().equalsIgnoreCase(userInput)).collect(Collectors.toList()));
    }
}
