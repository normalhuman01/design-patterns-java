package com.edujlac.strategy.ducktype;

import com.edujlac.strategy.Duck;
import com.edujlac.strategy.behavior.fly.FlyWithWings;
import com.edujlac.strategy.behavior.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        super.setFlyBehavior(new FlyWithWings());
        super.setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
