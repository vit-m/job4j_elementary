package ru.job4j;

public class PrimeNumber {
    public static int calc(int finish) {
        int count = 0;
        for (int i = 2; i <= finish; i += 1) {
            if (CheckPrimeNumber.check(i)) {
                count += 1;
            }
        }
        return count;
    }
}
