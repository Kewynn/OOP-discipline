package firstListReview.RegisterPeople;

public abstract class People {
	private String nome;
	private Date nascimento;

	public People(String nome, Date nascimento) {
		this.nome = nome;
		this.nascimento = nascimento;
	}

	public People() {
		this.nome = "";
		this.nascimento = new Date();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public abstract void imprimeDados();

	public String toString() {
		return "Nome: " + nome + ", Data de nascimento: " + nascimento.toString();
	}

}
