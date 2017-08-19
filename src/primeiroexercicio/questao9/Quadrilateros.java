package primeiromodulo.questao9;

public abstract class Quadrilateros implements FormasGeometricas{
	private int ladoBase;
	private int ladoAltura;



	public Quadrilateros(int base, int altura) {
		this.ladoBase = base;
		this.ladoAltura = altura;
	}

	public Quadrilateros(int lado) {
		this.ladoAltura = lado;
	}

	public abstract double calcularArea();
	
	public double calcularPerimetro(){
		return this.ladoBase+this.ladoAltura;
	}
	

}
