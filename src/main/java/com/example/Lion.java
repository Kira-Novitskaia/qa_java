package com.example;

import java.util.List;

public class Lion {

    private final boolean hasMane;
    private final Feline feline; // изменения Feline feline

    public Lion(String sex, Feline feline) throws Exception { //изменения Feline feline
        this.feline = feline; // изменения инъекция.
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }
    //    Feline feline = new Feline();
    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}