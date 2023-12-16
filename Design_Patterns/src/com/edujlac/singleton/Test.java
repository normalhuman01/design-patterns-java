package com.edujlac.singleton;

public class Test {
    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            Thread thread = new Thread(() -> Singleton.getInstance().getReference());
            thread.start();
        }
    }
}
