package observerPatternExample;

import java.util.ArrayList;
import java.util.List;

public class ConcreteObserver implements Observer {

	private Subject subject;
	private String nome;
	private String cpf;
	private List<String> magazines;

	public ConcreteObserver() {
		this.subject = new ConcreteSubject();
		this.nome = "";
		this.cpf = "";
		this.magazines = new ArrayList<String>();
	}

	@Override
	public void update(String m) {
		this.magazines.add(m);

	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Subject getSubject() {
		return subject;
	}

	public List<String> getMagazines() {
		return magazines;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj instanceof ConcreteObserver) {
			ConcreteObserver obs = (ConcreteObserver) obj;
			if (this.nome == obs.getNome() && this.cpf == obs.getCpf()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Name: " + this.nome + " CPF: " + this.cpf;
	}

}
