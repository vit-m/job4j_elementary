package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 1; i < data.length; i += 1) {
            if (data[0] != data[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
