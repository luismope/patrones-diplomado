package org.example.problema2.builder;

import org.example.problema2.components.Crust;
import org.example.problema2.components.Ingredients;
import org.example.problema2.components.Size;
import org.example.problema2.product.Pizza;

import java.util.ArrayList;

public class PizzaBuilder implements Builder {

    private Size size;
    private Crust crust;
    private ArrayList<Ingredients> ingredients;
    private Boolean hasExtraCheese;

    @Override
    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public void setCrust(Crust crust) {
        this.crust = crust;
    }

    @Override
    public void setIngredients(ArrayList<Ingredients> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public void setHasExtraCheese(Boolean hasExtraCheese) {
        this.hasExtraCheese = hasExtraCheese;
    }

    public Pizza getResult() {
        return new Pizza(size, crust, ingredients, hasExtraCheese);
    }

}
