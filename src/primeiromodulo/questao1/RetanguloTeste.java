package primeiromodulo.questao1;

import java.util.Scanner;

public class RetanguloTeste {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Retangulo firstTest = new Retangulo();
		System.out.println("Digite a altura: ");
		firstTest.setAltura(Double.parseDouble(leitor.nextLine()));
		System.out.println("Digite a largura: ");
		firstTest.setLargura(Double.parseDouble(leitor.nextLine()));
		Retangulo secondTest = new Retangulo(10.0, 15.0);
		Retangulo thirdTest = new Retangulo(20.0, 15.0);
		
		System.out.println(firstTest.equals(secondTest));
		System.out.println(thirdTest.calcularArea());
		System.out.println(thirdTest.calcularPerimetro());
		System.out.println(firstTest.toString());
		leitor.close();
		

	}

}
