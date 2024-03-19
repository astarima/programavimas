package org.example;

public class Beverage extends Product {
    private boolean isaAlcoholic;
    private int volume;
    private Type type;
    public Beverage(String name, double price,int volume, Type type, boolean isaAlcoholic) {
        super(name, price);

        this.isaAlcoholic = isaAlcoholic;
        this.volume = volume;
        this.type = type;
    }

    enum Type {
        VANDUO,
        LIMONADAS,
        SODA,
        VYNAS,
        SULTYS,
        KAVA
    }
}
