package org.example.problema2;

import org.example.problema2.builder.PizzaBuilder;
import org.example.problema2.components.Crust;
import org.example.problema2.components.Ingredients;
import org.example.problema2.components.Size;
import org.example.problema2.director.Director;
import org.example.problema2.product.Pizza;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Director pizzeria = new Director();
        PizzaBuilder pizzaBuilder = new PizzaBuilder();

        //Order client
        Ingredients.MUSHROOMS.setAmount(5);
        Ingredients.CHEESE.setAmount(1);
        Ingredients.PEPPERS.setAmount(4);
        Ingredients.ONION.setAmount(10);
        ArrayList<Ingredients> ingredients = new ArrayList<>(
                Arrays.asList(Ingredients.MUSHROOMS, Ingredients.CHEESE, Ingredients.PEPPERS, Ingredients.ONION));

        pizzeria.makePizza(pizzaBuilder, Size.BIG, Crust.WHOLE, ingredients, true);
        Pizza pizza = pizzaBuilder.getResult();

        Bill bill = new Bill(pizza);
        bill.getBill();
    }
}