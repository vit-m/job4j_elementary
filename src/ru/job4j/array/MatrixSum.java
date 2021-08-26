package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int result = 0;
        for (int i = 0; i < array.length; i += 1) {
            for (int j = 0; j < array[i].length; j += 1) {
                result += array[i][j];
            }
        }
        return result;
    }
}
