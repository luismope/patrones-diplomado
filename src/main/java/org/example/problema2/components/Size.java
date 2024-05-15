package org.example.problema2.components;

public enum Size {
    SMALL("Pequeña",22500), MEDIUM("Mediana",32000), BIG("Grande",41900);

    private String name;
    private double price;

    Size(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
