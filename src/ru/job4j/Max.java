package ru.job4j;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int first, int second, int third) {
        int result = max(third, max(first, second));
        return result;
    }

    public static int max(int first, int second, int third, int fourth) {
        int result = max(max(third, fourth), max(first, second));
        return result;
    }
}
