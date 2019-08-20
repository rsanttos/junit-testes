package param.temperature;


public class ConversorTemperatura{  
  
    public ConversorTemperatura(){ }  
  
    public Temperatura converte(Temperatura temp) throws TempException{  
       if(temp instanceof Fahrenheit) return converteToCelsius(temp);  
       else return converteToFahrenheit(temp);  
    }  
  
    private Temperatura converteToFahrenheit(Temperatura celsius) throws TempException{  
       Fahrenheit f = new Fahrenheit();  
       double cvalue = celsius.getValue();   
       double fvalue = 1.8*cvalue+f.getFREEZE(); // formula 1  
       f.setValue(fvalue);  
       return f;  
    }  
  
    private Temperatura converteToCelsius(Temperatura fahrenheit) throws TempException{  
       Celsius c = new Celsius();  
       int fvalue = (int) fahrenheit.getValue();   
       int cvalue = (int) ((fvalue-fahrenheit.getFREEZE())/(1.8));// formula 2 ?!  
       c.setValue(cvalue);  
       return c;  
    }  
  
}  