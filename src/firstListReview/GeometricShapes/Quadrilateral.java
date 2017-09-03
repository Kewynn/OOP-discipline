package firstListReview.GeometricShapes;

public abstract class Quadrilateral implements GeometricShapes {
	private double ladoBase;
	private double ladoAltura;

	public Quadrilateral(double base, double altura) {
		this.ladoBase = base;
		this.ladoAltura = altura;
	}

	public Quadrilateral(int lado) {
		this.ladoAltura = lado;
	}

	public abstract double calcularArea();

	public double calcularPerimetro() {
		return this.ladoBase + this.ladoAltura;
	}

}
