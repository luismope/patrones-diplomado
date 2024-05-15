package org.example.Problema2.director;

import org.example.Problema2.builder.Builder;
import org.example.Problema2.components.Crust;
import org.example.Problema2.components.Ingredients;
import org.example.Problema2.components.Size;

import java.util.ArrayList;

public class Director {

    public void makePizza(Builder builder, Size size, Crust crust, ArrayList<Ingredients> ingredients,
                          Boolean hasExtraCheese) {
        builder.setSize(size);
        builder.setCrust(crust);
        builder.setIngredients(ingredients);
        builder.setHasExtraCheese(hasExtraCheese);
    }

}
