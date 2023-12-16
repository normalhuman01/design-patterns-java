package com.edujlac.decorator;

import com.edujlac.decorator.beverages.Beverage;
import com.edujlac.decorator.beverages.DarkRoast;
import com.edujlac.decorator.beverages.Espresso;
import com.edujlac.decorator.beverages.HouseBlend;
import com.edujlac.decorator.condiments.Mocha;
import com.edujlac.decorator.condiments.Soy;
import com.edujlac.decorator.condiments.Whip;
import com.edujlac.decorator.sizes.LargeSize;
import com.edujlac.decorator.sizes.MediumSize;
import com.edujlac.decorator.sizes.SmallCoffee;

public class StarBuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage = new LargeSize(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        beverage1 = new MediumSize(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        beverage2 = new SmallCoffee(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
