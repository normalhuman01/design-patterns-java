package com.edujlac.factory.pizzaingredient;

import com.edujlac.factory.pizzaingredient.cheese.Cheese;
import com.edujlac.factory.pizzaingredient.clams.Clams;
import com.edujlac.factory.pizzaingredient.dough.Dough;
import com.edujlac.factory.pizzaingredient.pepperoni.Pepperoni;
import com.edujlac.factory.pizzaingredient.sauce.Sauce;
import com.edujlac.factory.pizzaingredient.veggies.Veggies;

public class CaliforniaPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return null;
    }

    @Override
    public Sauce createSauce() {
        return null;
    }

    @Override
    public Cheese createCheese() {
        return null;
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[0];
    }

    @Override
    public Pepperoni createPepperoni() {
        return null;
    }

    @Override
    public Clams createClam() {
        return null;
    }
}
