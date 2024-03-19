package org.example;

public class MainDish  extends Product {
    private Type type;
    private boolean vegan;
    private int calories;


    public MainDish(String name, double price, Type type, boolean vegan, int calories) {
        super(name, price);

        this.type = type;
        this.vegan = vegan;
        this.calories = calories;


    }

    enum Type{
        BLYNAI,
        LIETINIAI,
        VAFLIAI,
        SALOTOS,
        SUMUSTINIAI

    }
}
