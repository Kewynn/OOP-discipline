package primeiromodulo.questao9;

import java.util.ArrayList;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		List<FormasGeometricas> a = new ArrayList<FormasGeometricas>();
		Quadrilateros r1 = new Retangulo(5, 6);
		Quadrilateros r2 = new Retangulo(20, 10);
		
		Quadrilateros q1 = new Quadrado(10);
		Quadrilateros q2 = new Quadrado(6);
		
		Circulo c1 = new Circulo(3);
		Circulo c2 = new Circulo(7);
		
		
		a.add(r1);
		a.add(r2);
		a.add(q1);
		a.add(q2);
		a.add(c1);
		a.add(c2);
		
		for(FormasGeometricas f: a){
			if(f instanceof Retangulo){
				System.out.println(f.toString());
				System.out.println("Área: "+f.calcularArea());
				System.out.println("Perímetro: "+f.calcularPerimetro());
			}else if(f instanceof Quadrado){
				System.out.println(f.toString());
				System.out.println("Área: "+f.calcularArea());
				System.out.println("Perímetro: "+f.calcularPerimetro());
			}else if(f instanceof Circulo){
				System.out.println(f.toString());
				System.out.println("Área: "+f.calcularArea());
				System.out.println("Perímetro: "+f.calcularPerimetro());
			}
		}
		
	}

}
