package firstListReview.GeometricShapes;

import static org.junit.Assert.*;

import org.junit.Test;

import firstListReview.GeometricShapes.Circle;
import firstListReview.GeometricShapes.GeometricShapes;
import firstListReview.GeometricShapes.Square;
import firstListReview.GeometricShapes.Rectangle;

public class GeometricShapesTest {
	GeometricShapes c = new Circle(3.0), q = new Square(10), r = new Rectangle(3, 5);

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
