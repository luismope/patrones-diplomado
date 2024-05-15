package org.example.problema2;

import org.example.problema2.product.Pizza;

public class Bill {

    private static double priceExtraCheese = 2500;
    private Pizza pizza;

    public Bill(Pizza pizza) {
        this.pizza = pizza;
    }

    public void getBill() {

        System.out.println("Detalle de la Factura:");
        System.out.println("=====================\n");

        System.out.println("Tamaño de la pizza " + pizza.getSize().getName() + " a $" + pizza.getSize().getPrice());
        System.out.println("Tipo de masa " + pizza.getCrust().getName() + " a $" + pizza.getCrust().getPrice());
        if (this.pizza.getHasExtraCheese()) {
            System.out.println("Cobertura adicional Queso Extra borde de la masa a $" + priceExtraCheese);
        }

        System.out.println("\nIngredientes");
        System.out.println("Cantidad\t Ingrediente\t Costo por Unidad \t Costo total");
        pizza.getIngredients().forEach(i -> {
            double costoTotalIngrediente = i.getAmount() * i.getPrice();
            System.out.println(i.getAmount() +"\t "+ i.getName() +"\t "+ i.getPrice() +"\t "+ costoTotalIngrediente);
        });

        System.out.println("\n=====================");
        System.out.println("Costo total del pedido: $" + getTotalPizza());
    }

    private Double getTotalPizza() {
        Double total = this.pizza.getSize().getPrice() + this.pizza.getCrust().getPrice() +
                this.pizza.getIngredients().stream()
                        .filter(i -> i.getAmount() >0)
                        .mapToDouble(i -> i.getAmount() * i.getPrice())
                        .sum();
        if (this.pizza.getHasExtraCheese()) {
            total += priceExtraCheese;
        }
        return total;
    }
}
