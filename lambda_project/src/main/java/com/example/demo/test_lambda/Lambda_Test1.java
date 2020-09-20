package com.example.demo.test_lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Lambda_Test1 {
    //需要一个参数，没有返回值
    @Test
    public void test() {
        Consumer<String> con = (String s) -> {
            System.out.println(s);
        };
        con.accept("hello");
    }

    //类型推断
    @Test
    public void test2() {
        Consumer<String> con1 = (s) -> {
            System.out.println(s);
        };
        con1.accept("good");
    }

    //nt arr[] = new int[]{112};
    @Test
    public void test3() {
        Consumer<String> con1 = s -> {
            System.out.println(s);
        };
        con1.accept("good");
    }

    @Test
    public void test4() {
        Comparator<Integer> con1 = (o1, o2) -> {
            System.out.println(o1);
            System.out.println(o2);
            return o1.compareTo(o2);
        };
        System.out.println(con1.compare(12, 22));
        //final int compare = con1.compare(12, 22);
    }

    @Test
    public void test5() {
        Comparator<Integer> con1 = (o1, o2) -> o1.compareTo(o2);
        System.out.println(con1.compare(12, 22));
    }


    public void happyTime(double money, Consumer<Double> con) {
        con.accept(money);

    }

    @Test
    public void test6() {
        this.happyTime(400, money -> System.out.println("测试lambda"));
    }


    public List<String> filterString(List<String> list, Predicate<String> pre) {
        ArrayList<String> filterList = new ArrayList<>();
        for (String s : list) {
            if (pre.test(s)) {
                filterList.add(s);
            }
        }
        return filterList;
    }

    @Test
    public void test8() {
        final List<String> list = Arrays.asList("天津", "北京", "南京", "东京", "西京");
        final List<String> filterList = filterString(list, s -> s.contains("京"));

        System.out.println(filterList);
    }

}
