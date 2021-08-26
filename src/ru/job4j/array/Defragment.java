package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int i = 0; i < array.length; i += 1) {
            if (array[i] == null) {
                int point = i;
                for (int j = i + 1; j < array.length; j += 1) {
                    if (array[j] != null) {
                        array[point] = array[j];
                        array[j] = null;
                        break;
                    }
                }
            }
            System.out.print(array[i] + " ");
        }
        return array;
    }
}
