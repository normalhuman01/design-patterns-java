package com.edujlac.decorator.sizes;

import com.edujlac.decorator.beverages.Beverage;

public class SmallCoffee extends SizeDecorator{
    Beverage beverage;

    public SmallCoffee(Beverage beverage) {
        this.beverage = beverage;
        this.beverage.setSize(Size.SMALL);
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", tall";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
