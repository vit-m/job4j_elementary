package ru.job4j;

public class CheckPrimeNumber {

    public static boolean check(int number) {
        boolean prime = number > 1;

        for (int i = 2; i < number; i += 1) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
