package org.example.Problema2.components;

public enum Ingredients{
    CHEESE("Queso", 0, 3000), PEPPERONI("Pepperoni", 0, 1500),
    HAM("Jamón", 0, 1250), MUSHROOMS("Champiñones", 0, 2500),
    PEPPERS("Pimientos", 0, 1800), ONION("Cebolla", 0, 800),
    OLIVES("Aceitunas", 0, 1400), PINEAPLE("Piña", 0, 2000);

    private String name;
    private int amount;
    private double price;

    Ingredients(String name, int amount, double price) {
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }
}