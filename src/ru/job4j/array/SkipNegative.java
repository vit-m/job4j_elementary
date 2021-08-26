package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int i = 0; i < array.length; i += 1) {
            for (int j = 0; j < array[i].length; j += 1) {
                 if (array[i][j] < 0) {
                     array[i][j] = 0;
                 }
            }
        }
        return array;
    }
}
