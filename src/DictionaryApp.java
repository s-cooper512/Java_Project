import domain.WordInitializer;
import interfaces.Menu;

public class DictionaryApp {
    public static void main(String[] args) {
        WordInitializer.initWordList();
        Menu.mainMenu();
    }
}
