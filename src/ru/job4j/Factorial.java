package ru.job4j;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i += 1) {
            result *= i;
        }
        return result;
    }
}
