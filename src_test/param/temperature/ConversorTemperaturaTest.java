package param.temperature;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConversorTemperaturaTest {  

    @Test
    public void testConverteToCelsius() throws TempException {
        ConversorTemperatura conversor = new ConversorTemperatura();
        Fahrenheit f = new Fahrenheit();
        f.setValue(50.0);
        Temperatura t = conversor.converte(f);
        assertTrue(t instanceof Celsius);
    }

    @Test
    public void testConverteToFahrenheit() throws TempException {
        ConversorTemperatura conversor = new ConversorTemperatura();
        Celsius c = new Celsius();
        c.setValue(50.0);
        Temperatura t = conversor.converte(c);
        assertTrue(t instanceof Fahrenheit);
    }
}