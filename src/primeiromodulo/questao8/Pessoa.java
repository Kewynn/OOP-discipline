package primeiromodulo.questao8;

public abstract class Pessoa {
	private String nome;
	private Data nascimento;
	
	public Pessoa(String nome, Data nascimento) {
		this.nome = nome;
		this.nascimento = nascimento;
	}
	public Pessoa() {
		this.nome ="";
		this.nascimento = new Data();
	}
	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Data getNascimento() {
		return nascimento;
	}
	public void setNascimento(Data nascimento) {
		this.nascimento = nascimento;
	}
	public abstract void imprimeDados();
	@Override
	public String toString() {
		return "Pessoa nome=" + nome + ", nascimento=" + nascimento.toString();
	}
	

}