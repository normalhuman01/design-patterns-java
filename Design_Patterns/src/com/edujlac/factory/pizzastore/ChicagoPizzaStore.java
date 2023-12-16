package com.edujlac.factory.pizzastore;

import com.edujlac.factory.pizza.CheesePizza;
import com.edujlac.factory.pizza.ClamPizza;
import com.edujlac.factory.pizza.PepperoniPizza;
import com.edujlac.factory.pizza.Pizza;
import com.edujlac.factory.pizzaingredient.ChicagoPizzaIngredientFactory;
import com.edujlac.factory.pizzaingredient.PizzaIngredientFactory;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();

        switch (type) {
            case "cheese":
                pizza = new CheesePizza(pizzaIngredientFactory);
                pizza.setName("Chicago Style Cheese Pizza");
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(pizzaIngredientFactory);
                pizza.setName("Chicago Style Cheese Pizza");
                break;
            case "clam":
                pizza = new ClamPizza(pizzaIngredientFactory);
                pizza.setName("Chicago Style Cheese Pizza");
                break;
        }

        return pizza;
    }
}
