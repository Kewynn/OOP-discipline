package primeiroexercicio.questao2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PessoaTest {
	Pessoa p = new Pessoa();

	@Before
	public void setUp() throws Exception {
		p.setAltura(1.75);
		p.setPeso(60.0);
	}

	@Test
	public void testIMC() {
		assertEquals(0.051, 0.051041667, p.calcularIMC());
	}

}
