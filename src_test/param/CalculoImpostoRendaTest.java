package param;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class) 
public class CalculoImpostoRendaTest {
    private double entrada;
    private double esperado; 

    public CalculoImpostoRendaTest(double entrada, double esperado){
        this.entrada = entrada;
        this.esperado = esperado;
    }

    @Parameters(name= "{index}: impostoRenda[{0}]={1}")
    public static Object[][] data() {
        return new Object[][] {
            { 1000.0, 0.0 },
            { 2000.0, 200.0 },
            { 6000.0, 900.0 },
            { 15000.0, 3000.0 },
            { 1200.0, 0.0 } 
        };
    }

    @Test
    public void calculaImpostoTest(){
        CalculoImpostoRenda calc = new CalculoImpostoRenda();
        assertEquals(this.esperado, calc.calculaImposto(this.entrada), 0.0);
    }

}