package com.edujlac.factory.pizzastore;

import com.edujlac.factory.pizza.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }


    /**
     * <code>abstract Product factoryMethod(String type)<br></code>
     * <ul>
     *     <li><strong>abstract:</strong> A factory method is abstract so the subclasses are counted on to handle object creation.</li>
     *     <li><strong>Product:</strong> A factory method returns a Product that is typically used within methods defined
     *     in the superclass.</li>
     *     <li><strong>factoryMethod:</strong> A factory method isolates the client (the code in the superclass,
     *     like orderPizza()) from knowing what kind of concrete Product is actually created.</li>
     *     <li><strong>String type:</strong> A factory method may be parameterized (or not) to select among several
     *     variations of a product.</li>
     *
     * @param type of Pizza
     * @return the required Pizza
     */
    protected abstract Pizza createPizza(String type);
}
