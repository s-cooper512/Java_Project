package domain;

public class Word {
    private String wordName, wordDefinition, wordType, wordUsage;

    //Constructors
    public Word(String name, String definition, String type, String usage) {
        setWordName(name);
        setWordDefinition(definition);
        setWordType(type);
        setWordUsage(usage);
    }

    //Getters
    public String getWordName() {
        return wordName;
    }

    public String getWordDefinition() {
        return wordDefinition;
    }

    public String getWordType() {
        return wordType;
    }

    public String getWordUsage() {
        return wordUsage;
    }

    //Setters

    public void setWordName(String wordName) {
        this.wordName = wordName;
    }

    public void setWordDefinition(String wordDefinition) {
        this.wordDefinition = wordDefinition;
    }

    public void setWordType(String wordType) {
        this.wordType = wordType;
    }

    public void setWordUsage(String wordUsage) {
        this.wordUsage = wordUsage;
    }
}
