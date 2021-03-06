package ru.job4j;

public class Converter {
    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 60;
        return result;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollars = Converter.rubleToDollar(140);
        System.out.println("140₽ are " + String.format("%.2f", euro) + "€");
        System.out.println("140₽ are " + "$" + String.format("%.2f", dollars));

        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140₽ are 2€. Test result: " + passed);

        in = 140;
        expected = 2.3333333f;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("140₽ are $2,33. Test result: " + passed);
    }
}
