package ru.job4j;

public class Mortgage {
    public static int year(double amount, int salary, double persent) {
        int year = 0;

        while (amount > 0) {
            amount = (amount + amount * persent / 100) - salary;
            year += 1;
        }

        return year;
    }
}
