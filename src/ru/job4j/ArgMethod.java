package ru.job4j;

public class ArgMethod {
    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + ", age: " + age);
    }

    public static void main(String[] args) {
        String name = "Vitalik";
        int age = 42;
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
    }
}
