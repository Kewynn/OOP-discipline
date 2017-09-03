package firstListReview.GeometricShapes;

public class Square extends Quadrilateral {
	private int lado;

	public Square(int base) {
		super(base);
		this.lado = base;
	}


	public double calcularArea() {
		return this.lado * this.lado;
	}

	public String toString() {
		return "Quadrado lado = " + lado;
	}

}
