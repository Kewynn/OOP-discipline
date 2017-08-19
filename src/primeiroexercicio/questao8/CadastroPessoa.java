package primeiromodulo.questao8;

import java.util.ArrayList;
import java.util.List;

public class CadastroPessoa {
	private List<Pessoa> pessoas;
	
	public CadastroPessoa(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	public CadastroPessoa() {
		this.pessoas = new ArrayList<Pessoa>();
	}
	
	public void cadastraPessoa(Pessoa p){
		pessoas.add(p);
	}

	public void getPessoas(){
		for(Pessoa p: pessoas){
			if(p instanceof Gerente){
				System.out.println(p.toString()+" imposto de 3%.");
			}else if(p instanceof Funcionario){
				System.out.println(p.toString()+" imposto de 5%.");
			}else if(p instanceof Cliente){
				System.out.println(p.toString());
		}	}
	}

}
