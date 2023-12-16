package com.edujlac.factory.pizzastore;

import com.edujlac.factory.pizza.CheesePizza;
import com.edujlac.factory.pizza.ClamPizza;
import com.edujlac.factory.pizza.PepperoniPizza;
import com.edujlac.factory.pizza.Pizza;
import com.edujlac.factory.pizzaingredient.NYPizzaIngredientFactory;
import com.edujlac.factory.pizzaingredient.PizzaIngredientFactory;
import com.edujlac.factory.pizzastore.PizzaStore;

public class NYPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {

        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

        switch (item) {
            case "cheese":
                pizza = new CheesePizza(pizzaIngredientFactory);
                pizza.setName("New York Style Cheese Pizza");
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(pizzaIngredientFactory);
                pizza.setName("New York Style Cheese Pizza");
                break;
            case "clam":
                pizza = new ClamPizza(pizzaIngredientFactory);
                pizza.setName("New York Style Cheese Pizza");
                break;
        }

        return pizza;
    }
}
