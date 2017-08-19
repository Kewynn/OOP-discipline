package primeiroexercicio.questao1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RetanguloTest {
	int a, b, c;
	Retangulo r = new Retangulo();;

	@Before
	public void setUp() throws Exception {
		a = 5;
		b = 5;
		c = 25;
		r.setAltura(a);
		r.setLargura(b);

	}

	@Test
	public void calcularAreaTest() {
		assertEquals(c, r.calcularArea());
	}

	@Test
	public void calcularPerimetroTeste() {
		assertEquals(20, r.calcularPerimetro());
	}

}
