package primeiroexercicio.questao9;

public class Retangulo extends Quadrilateros {
	private double base;
	private double altura;

	public Retangulo(double base, double altura) {
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
