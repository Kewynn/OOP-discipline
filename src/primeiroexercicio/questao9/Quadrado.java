package primeiroexercicio.questao9;

public class Quadrado extends Quadrilateros {
	private int lado;

	public Quadrado(int base) {
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
