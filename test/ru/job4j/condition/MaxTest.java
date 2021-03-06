package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax5To5Then5() {
        int result = Max.max(5, 5);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax4To10Then10() {
        int result = Max.max(10, 4);
        assertThat(result, is(10));
    }

    @Test
    public void whenMaxOf3Then10() {
        int result = Max.max(10, 4, 6);
        assertThat(result, is(10));
    }

    @Test
    public void whenMaxOf4Then10() {
        int result = Max.max(5, 9, 6, 2);
        assertThat(result, is(9));
    }
}