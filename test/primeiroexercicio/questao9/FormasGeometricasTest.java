package primeiroexercicio.questao9;

import static org.junit.Assert.*;

import org.junit.Test;

public class FormasGeometricasTest {
	FormasGeometricas c = new Circulo(3.0), q = new Quadrado(10), r = new Retangulo(3, 5);

	@Test
	public void areaCirculoTest() {
		assertEquals(28.2, 28.2744, c.calcularArea());
	}

	@Test
	public void areaRetanguloTest() {
		assertEquals(15, 15.0, r.calcularArea());
	}

	@Test
	public void areaQuadradoTest() {
		assertEquals(100, 100.0, q.calcularArea());
	}

}
