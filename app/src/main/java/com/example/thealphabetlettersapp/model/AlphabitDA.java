package com.example.thealphabetlettersapp.model;

import java.util.ArrayList;
import java.util.List;

public class AlphabitDA implements IAlphabitDA {

    private ArrayList<Alphabit> characters =new ArrayList<>();

    public AlphabitDA(){

        characters.add(new Alphabit("A"," Apple"));
        characters.add(new Alphabit("B","Ball"));
        characters.add(new Alphabit("C"," Car"));
        characters.add(new Alphabit("D"," Dream"));
        characters.add(new Alphabit("E","Elephant"));
        characters.add(new Alphabit("F","  Friend"));
        characters.add(new Alphabit("G"," Game"));
        characters.add(new Alphabit("H","House"));
        characters.add(new Alphabit("I"," Institution"));
        characters.add(new Alphabit("J"," Juice"));
        characters.add(new Alphabit("K","Kite"));
        characters.add(new Alphabit("L"," Lemon"));
        characters.add(new Alphabit("M"," Mouse"));
        characters.add(new Alphabit("N","Nose"));
        characters.add(new Alphabit("O"," Orange"));
        characters.add(new Alphabit("P"," Pineapple"));
        characters.add(new Alphabit("Q","Queen"));
        characters.add(new Alphabit("R"," Rainbow"));
        characters.add(new Alphabit("S"," Sun"));
        characters.add(new Alphabit("T","Tree"));
        characters.add(new Alphabit("U"," Unicorn"));
        characters.add(new Alphabit("V"," Van"));
        characters.add(new Alphabit("W","World"));
        characters.add(new Alphabit("X"," oX"));
        characters.add(new Alphabit("Y"," Yesterday"));
        characters.add(new Alphabit("Z","Zebra"));

    }

    public List<Alphabit> getCharachers(String charcher){
        ArrayList<Alphabit> data=new ArrayList<>();
        for (Alphabit A :characters){
            if (A.getCharacter().equals(charcher)){
                data.add(A);
            }
        }
        return data;
    }


}
