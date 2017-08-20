package primeiroexercicio.questao9;

public abstract class Quadrilateros implements FormasGeometricas {
	private double ladoBase;
	private double ladoAltura;

	public Quadrilateros(double base, double altura) {
		this.ladoBase = base;
		this.ladoAltura = altura;
	}

	public Quadrilateros(int lado) {
		this.ladoAltura = lado;
	}

	public abstract double calcularArea();

	public double calcularPerimetro() {
		return this.ladoBase + this.ladoAltura;
	}

}
