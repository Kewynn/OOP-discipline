package firstListReview.Polygon;

import java.util.ArrayList;
import java.util.List;

public class Polygon {
	private List<Point> pontos;

	public Polygon() {
		this.pontos = new ArrayList<Point>();
	}

	public Polygon(List<Point> pontos) {
		this.pontos = pontos;
	}

	public void adicionarPonto(Point var) {
		pontos.add(var);
	}

	public void removerPonto(Point p) {
		for (Point i : pontos) {
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
		for (Point p : pontos) {

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
		for (Point p : pontos) {
			temp += "Cordenada X " + p.getCordenadaX() + "Cordenada Y " + p.getCordenadaY() + "\n";
		}
		return temp;
	}

}
