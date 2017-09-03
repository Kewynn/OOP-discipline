package firstListReview.RegisterPeople;

import java.util.ArrayList;
import java.util.List;

public class RegisterPeople {
	private List<People> pessoas;

	public RegisterPeople(List<People> pessoas) {
		this.pessoas = pessoas;
	}

	public RegisterPeople() {
		this.pessoas = new ArrayList<People>();
	}

	public void cadastraPessoa(People p) {
		pessoas.add(p);
	}

	public void getPessoas() {
		for (People p : pessoas) {
			if (p instanceof Manager) {
				System.out.println(p.toString() + " imposto de 3%.");
			} else if (p instanceof Staff) {
				System.out.println(p.toString() + " imposto de 5%.");
			} else if (p instanceof Cliente) {
				System.out.println(p.toString());
			}
		}
	}

}
