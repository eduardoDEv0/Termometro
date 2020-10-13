package com.termometer.example.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    Converter converter = new Converter();

    @Test
    public void shouldReturnCelsiusWhenFarenheitIsInput() {
        double farenheitInput = 75;
        double expectedCelsiusResult = 23.88;

        assertEquals(expectedCelsiusResult,
                converter.convertFarenheitCelsius(farenheitInput), 0.02);
    }

    @Test
    public void shouldReturnFarenheitWhenCelciusIsInput() {
        //se espera el valor 75 si el valor es diferente a 75 manda error en la prueba que detecta jenkins :D
        double expectedFarenheitResult = 80;
        double celsiusInput = 23.88;

        assertEquals(expectedFarenheitResult,
                converter.convertCelsiusFarenheit(celsiusInput), 0.02);
    }
}
