package primeiroexercicio.questao3;

import java.util.ArrayList;
import java.util.List;

public class Poligono {
	private List<Ponto> pontos;

	public Poligono() {
		this.pontos = new ArrayList<Ponto>();
	}

	public Poligono(List<Ponto> pontos) {
		this.pontos = pontos;
	}

	public void adicionarPonto(Ponto var) {
		pontos.add(var);
	}

	public void removerPonto(Ponto p) {
		for (Ponto i : pontos) {
			if (i.equals(p)) {
				pontos.remove(i);
			}
		}
	}

	public int calcularArea() {
		int sizevalue = pontos.size();
		int[] x = new int[sizevalue], y = new int[sizevalue];
		int soma = 0;
		int temp = 0;
		for (Ponto p : pontos) {

			x[temp] = p.getCordenadaX();
			y[temp] = p.getCordenadaY();
			temp++;
		}
		SegundoFor: for (int i = 0; i < sizevalue; i++) {
			if (i == sizevalue - 1) {
				break SegundoFor;
			}
			int tempDois = (x[i] * y[i + 1]) - (x[i + 1] * y[i]);
			soma += tempDois;

		}
		soma /= 2;
		return soma;

	}

	public String toString() {
		String temp = "** Cordenadas **\n";
		for (Ponto p : pontos) {
			temp += "Cordenada X " + p.getCordenadaX() + "Cordenada Y " + p.getCordenadaY() + "\n";
		}
		return temp;
	}

}
