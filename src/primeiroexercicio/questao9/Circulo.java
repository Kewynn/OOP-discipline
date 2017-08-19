package primeiromodulo.questao9;

public class Circulo implements FormasGeometricas{
	private double raio;
	public final static double PI = 3.1416;
	
	public Circulo(int raio) {
		this.raio = raio;
	}
	public double calcularArea(){
		return PI*raio*raio;
	}
	public double calcularPerimetro(){
		return 2*PI*raio;
	}
	
	public String toString() {
		return "Circulo raio = " + raio;
	}
	
	

}
