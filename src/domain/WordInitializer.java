package domain;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordInitializer {


    public static List<Word> activeDictionary = new ArrayList<>();
    public static void initWordList () {
        String txtPath = "./lib/dictionary.txt";

        if (Files.exists(Path.of(txtPath))) {
            File dictionary = new File(txtPath);
            try (Scanner checkLines = new Scanner(dictionary)) {
                while (checkLines.hasNextLine()) {
                    String[] wordComponents = checkLines.nextLine().split(" \\| ");
                    activeDictionary.add(new Word(wordComponents[0], wordComponents[1], wordComponents[2], wordComponents[3]));
                }
            } catch (IOException e) {
                throw new RuntimeException();
            }
        } else {
            System.out.println("Failed to find " + txtPath);
            throw new RuntimeException();
        }
    }

    public static void overwriteWordList() {
        //Add code to call the word writer for each item in activeDictionary and ensure that append is off
    }
}
