package interfaces;

import Util.GetInput;
import Util.PrintWords;
import domain.WordFinder;
import domain.WordInitializer;

public class Menu {

    public static void mainMenu() {
        System.out.println("""
                =====================================================================
                Welcome! Please enter the number corresponding to the desired option:
                1. Find a word(s)
                2. Find words by definition
                3. Find all words that start with -
                4. Find all words that end with -
                5. Find all words containing -
                6. Add a word
                7. Delete a word
                8. History
                9. Creator
                10. Save & Exit
                11. Exit without saving
                =====================================================================""");
        switch (GetInput.userInput()) {
            case "1":
                //Find word
                System.out.println("What word would you like to find?");
                PrintWords.printAllWordsInList(WordFinder.findWordByName(GetInput.userInput()));
                break;
            case "2":
                //find word by definition
                System.out.println("Find all words with definitions containing the word or phrase...");
                PrintWords.printAllWordsInList(WordFinder.findWordByDefinition(GetInput.userInput()));
                break;
            case "3":
                //Find all words that start with
                System.out.println("Find all words starting with...");
                PrintWords.printAllWordsInList(WordFinder.findWordStartingWith(GetInput.userInput()));
                break;
            case "4":
                //find all words that end with
                System.out.println("Find all words ending with...");
                PrintWords.printAllWordsInList(WordFinder.findWordEndingWith(GetInput.userInput()));
                break;
            case "5":
                //find all words containing
                System.out.println("Find all words that contain...");
                PrintWords.printAllWordsInList(WordFinder.findWordContaining(GetInput.userInput()));
                break;
            case "6":
                //Add word
                WordInitializer.addToWordList();
                break;
            case "7":
                //delete word
                System.out.println("What word would you like to remove? (this will remove all instances of that word)");
                WordInitializer.removeFromWordList(GetInput.userInput());
                break;
            case "8":
                //history
                break;
            case "9":
                //Creator
                Creator.readContent();
                break;
            case "10":
                //Save & Exit
                System.out.println("Saving updated dictionary...");
                WordInitializer.overwriteSavedDictionary();
            case "11":
                //Exit
                System.out.println("Exiting...");
                System.exit(0);
                break;
            default:
                GetInput.waitForEnter("Invalid input.");
                break;
        }
        GetInput.waitForEnter("\nPress Enter to return to the main menu...");
        Menu.mainMenu();
    }
}


