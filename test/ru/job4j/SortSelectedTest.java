package ru.job4j;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void whenSort5() {
        int[] input = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort3() {
        int[] input = new int[] {5, 1, 4};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort4() {
        int[] input = new int[] {3, 2, 4, 1};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4};
        assertThat(result, is(expect));
    }
}