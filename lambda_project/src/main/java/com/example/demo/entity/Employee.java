package com.example.demo.entity;

import lombok.Data;

@Data
public class Employee {
    private Integer id;
    private String name;
    private String address;

    public Employee(Integer id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
}
