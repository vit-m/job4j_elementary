package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] result = new int[size][size];
        for (int i = 0; i < result.length; i += 1) {
            for (int j = 0; j < result[i].length; j += 1) {
                result[i][j] = (i + 1) * (j + 1);
            }
        }
        return result;
    }
}
