package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int size = array.length - 1;
        for (int i = 0; i < array.length / 2; i += 1) {
            int temp = array[i];
            array[i] = array[size - i];
            array[size - i] = temp;
        }
        return array;
    }
}
