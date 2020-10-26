package ru.job4j.converte;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert480RblThen8Dollar() {
        int in = 480;
        int expected = 8;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }
}