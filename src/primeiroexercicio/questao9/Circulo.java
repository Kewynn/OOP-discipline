package primeiroexercicio.questao9;

public class Circulo implements FormasGeometricas {
	private double raio;
	public final static double PI = 3.1416;

	public Circulo(double raio) {
		this.raio = raio;
	}
	public Circulo(){
		this.raio = 0.0;
	}

	public double calcularArea() {
		return PI * raio * raio;
	}

	public double calcularPerimetro() {
		return 2 * PI * raio;
	}

	public String toString() {
		return "Circulo raio = " + raio;
	}

}
