package segundoexercicio.questao1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
	Calculadora calc;
	int a, b, c;
	double d;;

	@Before
	public void setUp() throws Exception {
		calc = new Calculadora();
		a = 66;
		b = 6;
		c = 666;
		d = 10.0;
	}

	@Test
	public void testMaior() {
		assertEquals(a, calc.maior(a, b));
		assertEquals(a, calc.maior(b, a));
	}
	@Test
	public void testSoma(){
		assertEquals(72, calc.somar(a, b));
		assertEquals(672, calc.somar(b,c));
	}
	@Test
	public void testSubtrair(){
		assertEquals(60, calc.subtrair(a, b));
		assertEquals(-60, calc.subtrair(b, a));
	}
	
	@Test(expected=ArithmeticException.class)
	public void testDividirPorZero(){
		assertEquals(2, calc.dividir(a, 0));
		
		
	}

}
