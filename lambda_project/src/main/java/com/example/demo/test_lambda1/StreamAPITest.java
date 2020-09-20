package com.example.demo.test_lambda1;

import com.example.demo.entity.Employee;
import com.example.demo.entity.EmployeeData;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPITest {
    @Test
    public void test() {
        final int[] arr = new int[]{1, 2, 4, 5};
        final IntStream stream = Arrays.stream(arr);


        final Employee e1 = new Employee(1001, "chery", "上海");
        final Employee e2 = new Employee(1001, "小叮做事小叮当", "上海");
        final Employee[] employees = new Employee[]{e1, e2};

        final Stream<Employee> stream1 = Arrays.stream(employees);
        final Stream<Integer> integerStream = Stream.of(1, 2, 3);
    }

    @Test
    public void test1() {
        // Stream.iterate(0, t -> t + 2).limit(10).forEach(System.out::println);
        //Stream.generate(Math::random).limit(10).forEach(System.out::println);
        final List<Employee> list = EmployeeData.getEmployee();
        // list.stream().filter(s -> s.getAddress().equals("上海")).limit(2).forEach(System.out::println);
        list.stream().skip(3).forEach(System.out::println);
        list.stream().distinct().forEach(System.out::println);
    }

    @Test
    public void test2() {
        final List<String> list = Arrays.asList("aa", "bb", "cc");
        //list.stream().map(str -> str.toUpperCase()).forEach(System.out::println);

        final List<Employee> employee = EmployeeData.getEmployee();
        employee.stream().map(str -> str.getAddress())
                .filter(s -> s.length() > 3)
                .forEach(System.out::println);

        final Stream<Stream<Character>> streamStream = list.stream().map(StreamAPITest::formStringToStream);
        streamStream.forEach(s -> {
            s.forEach(System.out::println);
        });
        final Stream<Character> characterStream = list.stream().flatMap(StreamAPITest::formStringToStream);
        characterStream.forEach(System.out::println);
    }


    public static Stream<Character> formStringToStream(String str) {
        ArrayList<Character> list = new ArrayList<>();
        for (Character c : str.toCharArray()) {
            list.add(c);
        }
        return list.stream();
    }

    @Test
    public void test3() {
        final List list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        final List list2 = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(6);
        //list.add(list2);
        list.addAll(list2);

    }

}
