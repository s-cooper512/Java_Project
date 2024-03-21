package domain;

import Util.GetInput;

public class Word {
    private String wordName, wordDefinition, wordType, wordUsage;

    //Constructors
    public Word(String name, String definition, String type, String usage) {
        setWordName(name);
        setWordDefinition(definition);
        setWordType(type);
        setWordUsage(usage);
    }

    public Word() {
        System.out.println("\nEnter the word that you would like to add: ");
        setWordName(GetInput.userInput());
        System.out.println("\nEnter the definition for the word: ");
        setWordDefinition(GetInput.userInput());
        System.out.println("\nEnter the type/part of speech for the word: ");
        setWordType(GetInput.userInput());
        System.out.println("\nEnter an example of the word's proper usage: ");
        setWordUsage(GetInput.userInput());
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
