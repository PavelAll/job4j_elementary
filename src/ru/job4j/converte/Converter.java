package ru.job4j.converte;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        in = 480;
        expected = 8;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("480 rubles are 8. Test result : " + passed);
    }
}
