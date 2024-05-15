package org.example.Problema2.components;

public enum Crust {
    THIN("Delgada", 3000), THICK("Gruesa",4000), WHOLE("Integral",5000);

    private String name;
    private double price;

    Crust(String name, double price) {
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
