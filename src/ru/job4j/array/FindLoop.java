package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int elem) {
        int result = -1;
        for (int i = 0; i < data.length; i += 1) {
            if (data[i] == elem) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static int indexOf(int[] data, int elem, int start, int finish) {
        int result = -1;
        for (int i = start; i <= finish; i += 1 ) {
            if (data[i] == elem) {
                result = i;
                break;
            }
        }
        return result;
    }
}
