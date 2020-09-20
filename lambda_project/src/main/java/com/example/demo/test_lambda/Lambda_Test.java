package com.example.demo.test_lambda;


import org.junit.Test;

import java.util.Comparator;

public class Lambda_Test {

    @Test
    public void test() {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("helloworld");
            }
        };
        r.run();
    }


    @Test
    public void test2() {
        Runnable r2 = () -> System.out.println("helloworld");
        r2.run();
    }


    @Test
    public void compare() {
        Comparator<Integer> com = (o1, o2) -> Integer.compare(o1, o2);
        int compare2=com.compare(1,2);
    }

    @Test
    public void compare1() {
        Comparator<Integer> comparator = Integer::compare;
    }
}
