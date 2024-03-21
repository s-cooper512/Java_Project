package Util;

import java.util.Scanner;

public class GetInput {
    public static String userInput() { //Called when the user is needed to enter input
        Scanner userInput = new Scanner(System.in);
        return userInput.nextLine();
    }

    public static void waitForEnter() {//Called when the program should stop until the user presses Enter. Overloaded constructor accepts a string for a custom memo.
        System.out.println("Press Enter to continue.");
        try{System.in.read();}
        catch(Exception ignored){}
    }

    public static void waitForEnter(String message) {
        System.out.println(message);
        try{System.in.read();}
        catch(Exception ignored){}
    }
}
