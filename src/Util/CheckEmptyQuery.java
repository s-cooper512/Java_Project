package Util;

import domain.Word;

import java.util.List;

public class CheckEmptyQuery {
    public static List<Word> noResults (List<Word> inputList) {
        if (inputList.size() <= 0) {
            System.out.println("\nYour query did not match any results. Please consider adding the entry to the dictionary or searching for another query.");
        }

        return (inputList);
    }
}
