package domain;
import java.util.Scanner;

public class Menu {

    static Scanner userInput = new Scanner(System.in);
    public static void mainMenu() {
        System.out.println("""
                ====================================================
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
                ====================================================""");
        switch (getInput()) {
            case "1":
                //Find word
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
                break;
            case "10":
                //Exit
                break;
            default:
                System.out.println("Invalid input. Press Enter to return to the main menu.");
                try{System.in.read();}
                catch(Exception ignored){}
                Menu.mainMenu();
                break;
        }
    }

    private static String getInput() {
        return userInput.next();
    }
}
