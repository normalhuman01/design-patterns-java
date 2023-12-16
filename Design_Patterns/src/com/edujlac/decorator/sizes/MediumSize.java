package com.edujlac.decorator.sizes;

import com.edujlac.decorator.beverages.Beverage;

public class MediumSize extends SizeDecorator{
    private Beverage beverage;

    public MediumSize(Beverage beverage) {
        this.beverage = beverage;
        this.beverage.setSize(Size.MEDIUM);
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", grande";
    }

    @Override
    public double cost() {
        return .15 + beverage.cost();
    }
}
