package ru.job4j.array;
import static ru.job4j.array.SwitchArray.swap;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int nullIndex = index;
                for (int i = index; i < array.length - 1; i++) {
                    if (array[i + 1] != null) {
                        int notNullIndex = i + 1;
                        SwitchArray.swap(array, nullIndex, notNullIndex);
                        break;
                    }
                }
            }
        }
        return array;
    }
}

