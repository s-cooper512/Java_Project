package interfaces;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Creator {

    public static void readContent () {
        String path = "./lib/Creator.txt"; //path to file that will have its contents read
        if (Files.exists(Path.of(path))) {
            File creator = new File(path);
            try (Scanner checkLines = new Scanner(creator)){
               while (checkLines.hasNextLine()) {
                    System.out.println(checkLines.nextLine());
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("Failed to find " + path);
            throw new RuntimeException();
        }
    }
}
