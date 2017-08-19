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
	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(obj instanceof Retangulo){
			Retangulo r = (Retangulo) obj;
			if(this.altura == r.getAltura() && this.largura == r.getLargura()){
				return true;
			}
			
		}return false;
	}
	
	public String toString() {
		return "Retangulo altura=" + altura + ", largura=" + largura;
	}


}