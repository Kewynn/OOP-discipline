package primeiromodulo.questao9;

public class Retangulo extends Quadrilateros{
	private int base;
	private int altura;
	
	public Retangulo(int base, int altura) {
		super(base, altura);
		this.base = base;
		this.altura = altura;
	}

	public double calcularArea(){
		return this.base*this.altura;
	}

	@Override
	public String toString() {
		return "Retangulo base = " + base + ", altura = " + altura;
	}
	
	

}
