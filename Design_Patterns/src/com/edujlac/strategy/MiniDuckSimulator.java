package com.edujlac.strategy;

import com.edujlac.strategy.behavior.fly.FlyRocketPowered;
import com.edujlac.strategy.ducktype.MallardDuck;
import com.edujlac.strategy.ducktype.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
