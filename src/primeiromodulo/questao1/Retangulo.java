package primeiromodulo.questao1;

public class Retangulo {
	
	private double altura;
	private double largura;
	
	public Retangulo(){
		this.altura = 0.0;
		this.largura = 0.0;
	}
	public Retangulo(double altura, double largura){
		this.altura = altura;
		this.largura = largura;
	}
	
	public double getAltura(){
		return this.altura;
		
	}public double getLargura(){
		return this.largura;
	}
	public void setAltura(double altura){
		this.altura = altura;
	}
	public void setLargura(double largura){
		this.largura = largura;
	}

	
	public double calcularArea(){
		return this.altura * this.largura;
	}

	public double calcularPerimetro(){
		return 2*(this.altura + this.largura);
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Retangulo other = (Retangulo) obj;
		if (Double.doubleToLongBits(altura) != Double.doubleToLongBits(other.altura))
			return false;
		if (Double.doubleToLongBits(largura) != Double.doubleToLongBits(other.largura))
			return false;
		return true;
	}
	
	public String toString() {
		return "Retangulo altura=" + altura + ", largura=" + largura;
	}


}