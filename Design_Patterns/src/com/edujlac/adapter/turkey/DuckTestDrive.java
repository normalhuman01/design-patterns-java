package com.edujlac.adapter.turkey;

import com.edujlac.adapter.exercise.IteratorEnumerator;
import com.edujlac.strategy.Duck;
import com.edujlac.strategy.ducktype.MallardDuck;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;

public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();

        WildTurkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("The turkey says...");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("\nThe Duck says");
        testDuck(mallardDuck);

        System.out.println("\nThe Turkey Adapter says...");
        testDuck(turkeyAdapter);

        System.out.println("\nThe Duck Adapter says...");
        Turkey turkey = new DuckAdapter(mallardDuck);
        tesTurkey(turkey);


        /* TESTING Iterator Adapter */
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Enumeration<Integer> enumeration = new IteratorEnumerator<>(integers.iterator());
        System.out.println(enumeration.nextElement().intValue());
        System.out.println(enumeration.hasMoreElements());
    }

    static void testDuck(Duck duck) {
        duck.performQuack();
        duck.performFly();
    }

    static void tesTurkey(Turkey turkey) {
        turkey.gobble();
        turkey.fly();
    }
}
