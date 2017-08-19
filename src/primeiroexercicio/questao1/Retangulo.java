package primeiroexercicio.questao1;

public class Retangulo {

	private int altura;
	private int largura;

	public Retangulo() {
		this.altura = 0;
		this.largura = 0;
	}

	public Retangulo(int altura, int largura) {
		this.altura = altura;
		this.largura = largura;
	}

	public double getAltura() {
		return this.altura;

	}

	public double getLargura() {
		return this.largura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	public int calcularArea() {
		return this.altura * this.largura;
	}

	public int calcularPerimetro() {
		return 2 * (this.altura + this.largura);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof Retangulo) {
			Retangulo r = (Retangulo) obj;
			if (this.altura == r.getAltura() && this.largura == r.getLargura()) {
				return true;
			}

		}
		return false;
	}

	public String toString() {
		return "Retangulo altura=" + altura + ", largura=" + largura;
	}

}