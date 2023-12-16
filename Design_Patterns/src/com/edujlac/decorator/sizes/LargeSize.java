package com.edujlac.decorator.sizes;

import com.edujlac.decorator.beverages.Beverage;

public class LargeSize extends SizeDecorator{
    private Beverage beverage;

    public LargeSize(Beverage beverage) {
        this.beverage = beverage;
        this.beverage.setSize(Size.LARGE);
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription().concat(", venti");
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
