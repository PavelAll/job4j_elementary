package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (second >= result && second >= third) {
            result = second;
        }
        if (third >= result && third >= second) {
            result = third;
        }
        return result;
    }

    public static void main(String[] args) {
    }
}
