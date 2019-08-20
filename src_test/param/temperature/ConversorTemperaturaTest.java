package param.temperature;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.*;

@RunWith(Parameterized.class) 
public class ConversorTemperaturaTest {  
	
    private int entrada;
    private int esperado; 


    public ConversorTemperaturaTest(int entrada, int esperado) {
		super();
		this.entrada = entrada;
		this.esperado = esperado;
	}

	@Parameters(name= "{index}: converte[{0}]={1}")
    public static Object[][] data() {
        return new Object[][] {
            { 0, 32 },
            { 15, 59 },
            { 5, 41 },
            { 20, 68 },
            { 10, 50 }
        };
    }

    @Test
    public void testConverteCelsiusToFahrenheit() throws TempException {
        ConversorTemperatura conversor = new ConversorTemperatura();
        Celsius c = new Celsius();
        c.setValue(entrada);
        Temperatura t = conversor.converte(c);
        assertEquals(esperado, t.getValue(), 0.0);
    }

	@Test
    public void testConverteFahrenheitToCelsius() throws TempException {
        ConversorTemperatura conversor = new ConversorTemperatura();
        Fahrenheit f = new Fahrenheit();
        f.setValue(esperado);
        Temperatura t = conversor.converte(f);
        assertEquals(entrada, t.getValue(), 0.0);
    }
}