package ru.job4j;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double x, double y) {
        return sum(x, y) + multiply(x, y);
    }

    public static double sumAndDivideWithSubstract(double x, double y) {
        return substract(x, y) + divide(x, y);
    }

    public static double sumTotal(double x, double y) {
        return sum(x, y) + multiply(x, y) + substract(x, y) + divide(x, y);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчёта равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчёта равен: " + sumAndDivideWithSubstract(10, 20));
        System.out.println("Результат расчёта равен: " + sumTotal(10, 20));
    }
}
