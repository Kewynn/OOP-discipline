package firstListReview.RegisterPeople;

public class Manager extends Staff {
	private String area;

	public Manager(String nome, Date nascimento, double salario, String area) {
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
