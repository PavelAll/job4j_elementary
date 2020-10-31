package ru.job4j.condition;

import static org.hamcrest.core.Is.is;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiMaxTest {

    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(10, 4, 2);
        assertThat(result, is(10));
    }

    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 40, 2);
        assertThat(result, is(40));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(5, 8, 29);
        assertThat(result, is(29));
    }

    @Test
    public void whenFullMax() {
        int result = MultiMax.max(15, 15, 15);
        assertThat(result, is(15));
    }
}