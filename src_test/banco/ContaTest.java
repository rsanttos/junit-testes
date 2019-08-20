package banco;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContaTest {

	@Test
	public void testDebitarSucesso() throws OperacaoIlegalException{
		Conta c = new Conta("123", 20);
		c.debitar(10);
		assertEquals(10,c.getSaldo(),0.0);
	} 
	
	@Test
	public void transferirSucesso() throws OperacaoIlegalException{
		Conta c1 = new Conta("123", 20);
		Conta c2 = new Conta("456", 10);
		double saldoAntigoC2 = c2.getSaldo(); 
		int valorATransferir = 10;
		c1.transferir(c2, valorATransferir);
		assertEquals(saldoAntigoC2+valorATransferir, c2.getSaldo(), 0.0);
	}

	@Test
	public void transferirException() throws OperacaoIlegalException{
		try{
			Conta c1 = new Conta("123", 20);
			Conta c2 = new Conta("456", 10);
			int valorATransferir = 30;
			c1.transferir(c2, valorATransferir);
			fail("Deu ruim");
		} catch (OperacaoIlegalException oe){
			oe.printStackTrace();
		}
	}
}
