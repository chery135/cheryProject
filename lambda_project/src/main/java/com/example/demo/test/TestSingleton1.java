package com.example.demo.test;

import java.util.concurrent.*;

public class TestSingleton1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Singleton1> c = () -> Singleton1.getInstance();

        ExecutorService e = Executors.newFixedThreadPool(2);
        final Future<Singleton1> submit1 = e.submit(c);
        final Future<Singleton1> submit2 = e.submit(c);
        final Singleton1 singleton1 = submit1.get();
        final Singleton1 singleton2 = submit2.get();
        System.out.println(singleton1 == singleton2);
        e.shutdown();

    }
}
