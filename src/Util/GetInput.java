package Util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetInput {
    public static List<String> history = new ArrayList<>();
    public static String userInput() { //Called when the user is needed to enter input
        Scanner userInputScanner = new Scanner(System.in);
        return (recordInput(userInputScanner.nextLine()));
    }

    public static void waitForEnter() {//Called when the program should stop until the user presses Enter. Overloaded constructor accepts a string for a custom memo.
        System.out.println("Press Enter to continue.");
        try{
            System.in.read();
            System.out.println(); //Little snackie for System.in
        } catch(Exception ignored){}
    }

    public static void waitForEnter(String message) {
        System.out.println(message);
        try{
            System.in.read();
            System.out.println();
        } catch(Exception ignored){}
    }

    private static String recordInput(String inputToRecord) {
        history.add(inputToRecord);
        return (inputToRecord);
    }

    public static void getHistory() {
        System.out.println("History==============================================================");
        history.forEach(System.out::println);
        System.out.println("=====================================================================");
    }
}
