package com.edujlac.factory;

import com.edujlac.factory.pizza.Pizza;
import com.edujlac.factory.pizzastore.PizzaStore;
import com.edujlac.factory.pizzastore.ChicagoPizzaStore;
import com.edujlac.factory.pizzastore.NYPizzaStore;

public class PizzaStoreFactory {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza + "\n");
    }
}
