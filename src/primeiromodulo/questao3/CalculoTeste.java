package primeiromodulo.questao3;

import java.util.Scanner;

public class CalculoTeste {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Poligono testPoligono = new Poligono(); 
		System.out.println("Quantidade de pontos: ");
		int lados = leitor.nextInt();
		for(int k = 0; k < lados; k++){
			Ponto p = new Ponto();
			System.out.println("Cordenada X");
			p.setCordenadaX(leitor.nextInt());
			System.out.println("Cordenada Y");
			p.setCordenadaY(leitor.nextInt());
			testPoligono.adicionarPonto(p);
		}
		System.out.println(testPoligono.toString());
		System.out.println(testPoligono.calcularArea());
		leitor.close();

	}

}
