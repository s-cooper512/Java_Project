package Util;

import domain.Word;

import java.util.List;

public class PrintWords {
    public static void printAllWordsInList (List<Word> inputWords) {
        inputWords.forEach(word -> System.out.println("\n" + word.getWordName() + "\nDefinition: " + word.getWordDefinition() + "\nType: " + word.getWordType() + "\nUsage: " + word.getWordUsage() + "\n"));
    }
}
