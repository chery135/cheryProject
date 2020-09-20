package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class EmployeeData {
    public static List<Employee> getEmployee() {
        final ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee(1001, "chery", "上海滩"));
        list.add(new Employee(1002, "张三", "北京西郊"));
        list.add(new Employee(1003, "李四", "南京东路"));
        list.add(new Employee(1004, "王五", "黄埔"));
        list.add(new Employee(1005, "李贺", "上海"));
        list.add(new Employee(1006, "叮咚", "上海"));
        return list;
    }
}
