package org.example;

public class Desert  extends Product {
    private Type type;
    private boolean isDairy;
    private int calories;

    public Desert(String name, double price, Type tape, boolean isDairy, int calories) {
        super(name, price);

        this.type = type;
        this.isDairy = isDairy;
        this.calories = calories;

    }

    enum Type {
        LEDAI,
        PUDINGAS,
        PYRAGAS,
        RIESTAINIS,
        BANDELE,
        KEKSIUKAS
    }

}


