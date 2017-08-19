package primeiroexercicio.questao8;

public class Cliente extends Pessoa {
	private int codigo;

	@Override
	public void imprimeDados() {
		System.out.println(this.codigo);

	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Cliente(String nome, Data nascimento, int codigo) {
		super(nome, nascimento);
		this.codigo = codigo;
	}

}
