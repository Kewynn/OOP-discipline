package primeiroexercicio.questao8;

public class Gerente extends Funcionario {
	private String area;

	public Gerente(String nome, Data nascimento, double salario, String area) {
		super(nome, nascimento, salario);
		this.area = area;
	}

	public void imprimeDados() {
		System.out.println(this.area);

	}

	public double calcularImposto() {
		return (this.salario * 5) / 100;

	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

}
