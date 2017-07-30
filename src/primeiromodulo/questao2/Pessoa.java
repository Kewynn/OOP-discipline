package primeiromodulo.questao2;

public class Pessoa {
	private String nome;
	private int idade;
	private String sexo;
	private double peso;
	private double altura;
	
	
	public Pessoa() {
		super();
		this.nome = "";
		this.idade = 0;
		this.sexo = "";
		this.peso =  0.0;
		this.altura = 0.0;
		
		
	}

	public Pessoa(String nome, int idade, double altura, double peso, String sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public double calcularIMC(){
		double temp = this.peso /(Math.pow(this.altura, 2));
		return temp;
	}
	public String toString(){
		String temp = "";
		if(calcularIMC() <= 18.5){
			temp = "Abaixo do peso normal";
		}else if(calcularIMC() > 18.5 && calcularIMC() <= 25 ){
			temp = "Peso normal";
		}
		else if(calcularIMC() > 25 && calcularIMC() <= 30){
			temp = "Acima do peso normal";
		}else if(calcularIMC() > 30){
			temp = "Obesidade";
		}
		return temp;
		
	}
	
	
	

}
