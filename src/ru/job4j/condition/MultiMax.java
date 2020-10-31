package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = first > second ? first > third ? first : third : second > third ? second : third;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(MultiMax.max(4, 8, 29));
    }
}
