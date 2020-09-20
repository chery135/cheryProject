package com.example.demo.test_lambda;

import org.junit.Test;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class Lambda_Test2 {
    @Test
    public void test1() {
        final PrintStream ps = System.out;
        Consumer<String> con = ps::println;
        con.accept("我爱你中国");
    }

    @Test
    public void test2() {
        Comparator<Integer> con = (o1, o2) -> Integer.compare(o1, o2);
        System.out.println(con.compare(12, 23));
        System.out.println("------------------------");

        Comparator<Integer> con1 = Integer::compare;
        System.out.println(con1.compare(22, 22));
    }

    @Test
    public void test3() {
        BiPredicate<String, String> pre1 = (s1, s2) -> s1.equals(s2);
        System.out.println(pre1.test("addd", "sda"));
    }

    @Test
    public void test4() {
        final List<Integer> list = Arrays.asList(12, 11, 24, 22, 89);
        list.stream().sorted().forEach(System.out::println);


    }
}
