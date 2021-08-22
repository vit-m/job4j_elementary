package ru.job4j;

public class Fit {
    public static double manWeight(short height) {
        double result = (height - 100) * 1.15;
        return result;
    }

    public static double womanWeight(short height) {
        double result = (height - 110) * 1.15;
        return result;
    }

    public static void main(String[] args) {
        short manHeight = 175;
        short womanHeight = 165;
        double man = Fit.manWeight(manHeight);
        double woman = Fit.womanWeight(womanHeight);

        System.out.println("Man 175 is " + String.format("%.2f", man));
        System.out.println("Woman 165 is " + String.format("%.2f", woman));
    }
}
