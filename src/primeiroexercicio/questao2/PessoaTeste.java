package primeiromodulo.questao2;

import java.util.Scanner;

public class PessoaTeste {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Pessoa h = new Pessoa();
		System.out.println("Digite o nome: ");
		h.setNome(leitor.nextLine());
		System.out.println("Digite a idade: ");
		h.setIdade(Integer.parseInt(leitor.nextLine()));
		System.out.println("Digite o gênero: ");
		h.setSexo(leitor.nextLine());
		System.out.println("Digite a altura: ");
		h.setAltura(Double.parseDouble(leitor.nextLine()));
		System.out.println("Digite o peso: ");
		h.setPeso(Double.parseDouble(leitor.nextLine()));
		
		System.out.println(h.calcularIMC());
		System.out.println(h.toString());
		leitor.close();
		

	}

}
