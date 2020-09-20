package com.example.demo.test;

import java.util.concurrent.TimeUnit;

public class Singleton1 {
    private static Singleton1 instance;

    private Singleton1() {

    }

    public static Singleton1 getInstance() throws InterruptedException {
        if (instance == null) {
            synchronized (Singleton1.class) {
                if (instance == null) {
                    TimeUnit.SECONDS.sleep(1);
                    instance = new Singleton1();
                }
            }
        }
        return instance;
    }

}
