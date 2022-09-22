package calculadora;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


class CalculadoraTest {
	Calculadora calc;

	@Before
	public void inicio() { 
		calc = new Calculadora();
	}
	@Test
	public void testSuma() {
		assertEquals("7 + 6",13.0,calc.suma(7, 6),.001);
	}
	
	@Test
	public void testResta() {
		assertEquals("7 - 6",1, calc.resta(7, 6), 0); 
		}
	
	@Test
	public void testMultiplica() {
		assertEquals("7 * 6", 42, calc.multiplica(7, 6),0);
	}
	
	@Test
	public void testDivide() {
		System.out.println(Double.toString(7/6));
		assertEquals("7 / 6", 1.66d, calc.divide(7, 6),.1);
	}
	
	@Test
	public void testDivideCero() {
		assertEquals("7 / 0", 0, calc.divide(7, 0),0);
	}


}
