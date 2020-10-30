package ru.job4j.condition;

public class LogicNot {

    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    public boolean isPositive(int num) {
        return num > 0;
    }

    public boolean notEven(int num) {
        return !isEven(num);
    }

    public boolean notPositive(int num) {
        return !isPositive(num);
    }

    public boolean notEvenAndPositive(int num) {
        return notEven(num) && isPositive(num);
    }

    public boolean evenOrNotPositive(int num) { // четное или отрицательное 2, 4, 8, 10 или -1 -3 - 5
        return isEven(num) || notPositive(num);
    }
}
