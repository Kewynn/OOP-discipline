package segundoexercicio.questao1;

public class Calculadora {

	public int maior(int a, int b) {
		return a > b ? a : b;
	}

	public int somar(int... s) {
		int total = 0;
		for (int i : s)
			total += i;
		return total;
	}

	public int subtrair(int a, int b) {
		return a - b;
	}

	public double raiz(double x) {
		return Math.sqrt(x);
	}

	public double media(double... x) {
		double total = 0.0;
		int k = 0;
		for (double i : x) {
			total += i;
			k++;
		}
		return total / k;

	}
	public int dividir(int a, int b){
		return a/b;
	}

}
