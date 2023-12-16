package com.edujlac.strategy.ducktype;

import com.edujlac.strategy.Duck;
import com.edujlac.strategy.behavior.fly.FlyNoWay;
import com.edujlac.strategy.behavior.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        super.setFlyBehavior(new FlyNoWay());
        super.setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }

}
