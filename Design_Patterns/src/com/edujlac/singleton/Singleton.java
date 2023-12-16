package com.edujlac.singleton;

public class Singleton {
    private volatile static Singleton singleton;

    private Singleton() {}

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) singleton = new Singleton();
            }
        }
        return singleton;
    }

    public void getReference() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " is currently running with object reference " + singleton);
    }
}
