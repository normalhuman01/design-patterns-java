package com.edujlac.decorator.condiments;

import com.edujlac.decorator.beverages.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
