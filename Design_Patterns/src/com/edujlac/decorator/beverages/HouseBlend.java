package com.edujlac.decorator.beverages;

public class HouseBlend extends Beverage{
    public HouseBlend() {
        super.setDescription("House Blend Coffee");
    }

    @Override
    public double cost() {
        return .89;
    }
}
