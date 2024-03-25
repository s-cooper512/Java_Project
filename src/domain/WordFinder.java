package domain;

import java.util.List;
import java.util.stream.Collectors;

public class WordFinder {
    public static List<Word> findWordByName (String userInput) {
        return (WordInitializer.activeDictionary.stream().filter(word -> word.getWordName().equalsIgnoreCase(userInput)).collect(Collectors.toList()));
    }

    public static List<Word> findWordByDefinition (String userInput) {
        return (WordInitializer.activeDictionary.stream().filter(word -> word.getWordDefinition().toLowerCase().contains(userInput.toLowerCase())).collect(Collectors.toList()));
    }

    public static List<Word> findWordStartingWith (String userInput) {
        return (WordInitializer.activeDictionary.stream().filter(word -> word.getWordName().toLowerCase().startsWith(userInput.toLowerCase())).collect(Collectors.toList()));
    }

    public static List<Word> findWordEndingWith (String userInput) {
        return (WordInitializer.activeDictionary.stream().filter(word -> word.getWordName().toLowerCase().endsWith(userInput.toLowerCase())).collect(Collectors.toList()));
    }

    public static List<Word> findWordContaining (String userInput) {
        return (WordInitializer.activeDictionary.stream().filter(word -> word.getWordName().contains(userInput)).collect(Collectors.toList()));
    }
}
