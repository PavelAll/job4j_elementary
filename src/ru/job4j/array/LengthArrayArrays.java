package ru.job4j.array;

public class LengthArrayArrays {

    public static void main(String[] args) {

        int[][] numbers = {{1}, {2, 3}, {4, 5, 6}, {6, 7, 8, 9}};

        for (int row = 0; row < numbers.length; row++) {
            System.out.println(numbers[row].length);
        }
    }
}
