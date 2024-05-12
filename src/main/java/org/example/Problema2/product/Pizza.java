package org.example.Problema2.product;

import org.example.Problema2.components.Crust;
import org.example.Problema2.components.Ingredients;
import org.example.Problema2.components.Size;

import java.util.ArrayList;

public class Pizza {
    private Size size;
    private Crust crust;
    private ArrayList<Ingredients> ingredients;
    private Boolean hasExtraCheese;

    public Pizza(Size size, Crust crust, ArrayList<Ingredients> ingredients, Boolean hasExtraCheese) {
        this.size = size;
        this.crust = crust;
        this.ingredients = ingredients;
        this.hasExtraCheese = hasExtraCheese;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Crust getCrust() {
        return crust;
    }

    public void setCrust(Crust crust) {
        this.crust = crust;
    }

    public ArrayList<Ingredients> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingredients> ingredients) {
        this.ingredients = ingredients;
    }

    public Boolean getHasExtraCheese() {
        return hasExtraCheese;
    }

    public void setHasExtraCheese(Boolean hasExtraCheese) {
        this.hasExtraCheese = hasExtraCheese;
    }

}
