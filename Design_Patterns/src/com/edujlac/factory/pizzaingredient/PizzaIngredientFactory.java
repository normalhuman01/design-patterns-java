package com.edujlac.factory.pizzaingredient;

import com.edujlac.factory.pizzaingredient.cheese.Cheese;
import com.edujlac.factory.pizzaingredient.clams.Clams;
import com.edujlac.factory.pizzaingredient.dough.Dough;
import com.edujlac.factory.pizzaingredient.pepperoni.Pepperoni;
import com.edujlac.factory.pizzaingredient.sauce.Sauce;
import com.edujlac.factory.pizzaingredient.veggies.Veggies;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();
}
