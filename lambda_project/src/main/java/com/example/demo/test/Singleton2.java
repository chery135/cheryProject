package com.example.demo.test;

public class Singleton2 {
    private Singleton2() {

    }

    private static class Innrer {
        private static final Singleton2 INSTANCE = new Singleton2();
    }

    public static Singleton2 getInstance() {
        return Singleton2.getInstance();
    }

}
