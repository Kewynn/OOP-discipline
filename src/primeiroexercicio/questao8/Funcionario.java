package primeiroexercicio.questao8;

public class Funcionario extends Pessoa {
	public double salario;

	public Funcionario(String nome, Data nascimento, double salario) {
		super(nome, nascimento);
		this.salario = salario;
	}

	@Override
	public void imprimeDados() {
		System.out.println(this.salario);

	}

	public double calcularImposto() {
		return (this.salario * 3) / 100;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

}
