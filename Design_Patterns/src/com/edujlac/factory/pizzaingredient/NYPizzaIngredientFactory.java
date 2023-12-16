package com.edujlac.factory.pizzaingredient;

import com.edujlac.factory.pizzaingredient.cheese.Cheese;
import com.edujlac.factory.pizzaingredient.cheese.ReggianoCheese;
import com.edujlac.factory.pizzaingredient.clams.Clams;
import com.edujlac.factory.pizzaingredient.clams.FleshClams;
import com.edujlac.factory.pizzaingredient.dough.Dough;
import com.edujlac.factory.pizzaingredient.dough.ThinCrustDough;
import com.edujlac.factory.pizzaingredient.pepperoni.Pepperoni;
import com.edujlac.factory.pizzaingredient.pepperoni.SlicedPepperoni;
import com.edujlac.factory.pizzaingredient.sauce.MarinaraSauce;
import com.edujlac.factory.pizzaingredient.sauce.Sauce;
import com.edujlac.factory.pizzaingredient.veggies.Garlic;
import com.edujlac.factory.pizzaingredient.veggies.Onion;
import com.edujlac.factory.pizzaingredient.veggies.RedPepper;
import com.edujlac.factory.pizzaingredient.veggies.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{ new Garlic(), new Onion(), new RedPepper()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FleshClams();
    }
}
