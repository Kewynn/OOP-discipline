package firstListReview.GeometricShapes;

public class Rectangle extends Quadrilateral {
	private double base;
	private double altura;

	public Rectangle(double base, double altura) {
		super(base, altura);
		this.base = base;
		this.altura = altura;
	}

	public double calcularArea() {
		return this.base * this.altura;
	}

	@Override
	public String toString() {
		return "Retangulo base = " + base + ", altura = " + altura;
	}

}
