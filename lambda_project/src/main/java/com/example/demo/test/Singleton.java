package com.example.demo.test;

/**
 * 饿汉式：直接创建对象，不管你需不需要这个对象
 * 构造器私有化
 * 向外提供这个实例
 * 强调这是一个实例，我们可以用final修饰
 */
public class Singleton {
    public static final Singleton INSTANCE = new Singleton();

    private Singleton() {

    }
}
