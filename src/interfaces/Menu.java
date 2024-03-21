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
                10. Exit
                =====================================================================""");
        switch (GetInput.userInput()) {
            case "1":
                //Find word
                System.out.println("What word would you like to find?");
                PrintWords.printAllWordsInList(WordFinder.findWordByName(GetInput.userInput()));
                GetInput.waitForEnter("Press Enter to return to the main menu...");
                Menu.mainMenu();
                break;
            case "2":
                //find word by definition
                break;
            case "3":
                //Find all words that start with
                break;
            case "4":
                //find all words that end with
                break;
            case "5":
                //find all words containing
                break;
            case "6":
                //Add word
                break;
            case "7":
                //delete word
                break;
            case "8":
                //history
                break;
            case "9":
                //Creator
                Creator.readContent();
                GetInput.waitForEnter("Press Enter to return to the main menu.");
                mainMenu();
                break;
            case "10":
                //Exit
                System.out.println("Exiting...");
                System.exit(0);
                break;
            default:
                GetInput.waitForEnter("Invalid input. Press Enter to return to the main menu.");
                Menu.mainMenu();
                break;
        }
    }
}


