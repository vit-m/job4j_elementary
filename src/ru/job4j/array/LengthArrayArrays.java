package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] arrays = {{1}, {2, 3}, {4, 5, 6}, {7, 8, 9, 10}};
        for (int i = 0; i < arrays.length; i++) {
            System.out.println("Размер вложенного массива равен: " + arrays[i].length);
        }
    }
}
