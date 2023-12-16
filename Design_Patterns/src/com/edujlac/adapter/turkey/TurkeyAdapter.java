package com.edujlac.adapter.turkey;

import com.edujlac.strategy.Duck;

public class TurkeyAdapter extends Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void performFly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }

    @Override
    public void performQuack() {
        turkey.gobble();
    }

    @Override
    public void display() {

    }
}
