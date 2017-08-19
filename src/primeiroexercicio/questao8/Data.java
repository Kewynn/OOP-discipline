package primeiroexercicio.questao8;

public class Data {
	private int dia;
	private int mes;
	private int ano;

	public Data(int dia, int mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public Data() {
		super();
		this.dia = 0;
		this.mes = 0;
		this.ano = 0;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}

}
