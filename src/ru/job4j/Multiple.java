package ru.job4j;

public class Multiple {
    public static void main(String[] args) {
        for (var i = 1; i < 10; i += 1) {
            var result = 1 * i;
            var string = "1 * " + i + " = " + result;
            System.out.println(string);
        }
    }
}
