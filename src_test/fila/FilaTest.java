package fila;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FilaTest {

    @Test
    public void testInserir(){
        Object obj = new Object();
        Fila fila = new Fila(3);
        fila.insereNaFila(obj);
        assertEquals(obj, fila.getFila()[fila.getFim()]);
    }
    @Test
    public void testRemover(){
        Object obj = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        Fila fila = new Fila(3);
        fila.insereNaFila(obj);
        fila.insereNaFila(obj2);
        fila.insereNaFila(obj3);   
        fila.removeDaFila();
        assertEquals(obj2, fila.getFila()[0]);    
    }   

    @Test
    public void limpaFila(){
        Object obj = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        Fila fila = new Fila(3);
        fila.insereNaFila(obj);
        fila.insereNaFila(obj2);
        fila.insereNaFila(obj3);

        fila.limpaFila();

        assertEquals(-1, fila.getFim());
    }

    @Test
    public void testEstaCheia(){
        Object obj = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        Fila fila = new Fila(3);
        fila.insereNaFila(obj);
        fila.insereNaFila(obj2);
        fila.insereNaFila(obj3);   
        assertTrue(fila.estaCheia());
    } 
    
    @Test
    public void testEstaVazia(){
        Fila fila = new Fila(3);
        assertTrue(fila.estaVazia());
    } 
}