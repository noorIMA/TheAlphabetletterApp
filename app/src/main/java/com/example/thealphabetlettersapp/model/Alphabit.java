package com.example.thealphabetlettersapp.model;

public class Alphabit {
        private String character;
        private  String Example;

    public Alphabit(String character, String example) {
        this.character = character;
        Example = example;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getExample() {
        return Example;
    }

    public void setExample(String example) {
        Example = example;
    }
}
