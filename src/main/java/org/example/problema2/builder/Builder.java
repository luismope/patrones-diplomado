package org.example.problema2.builder;

import org.example.problema2.components.Crust;
import org.example.problema2.components.Ingredients;
import org.example.problema2.components.Size;

import java.util.ArrayList;

public interface Builder {
    void setSize(Size size);
    void setCrust(Crust crust);
    void setIngredients(ArrayList<Ingredients> ingredients);
    void setHasExtraCheese(Boolean hasExtraCheese);

}
