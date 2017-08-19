package primeiromodulo.questao8;

public class TesteCadastro {

	public static void main(String[] args) {
		CadastroPessoa cp = new CadastroPessoa();
		Pessoa fUm = new Funcionario("KewynUm", new Data(1, 4, 1985), 3333.3);
		Pessoa fDois = new Funcionario("KewynDois", new Data(14, 4, 1995), 3773.3);
		Pessoa fTres = new Funcionario("KewynTres", new Data(1, 4, 5178), 9993.3);
		cp.cadastraPessoa(fUm);
		cp.cadastraPessoa(fDois);
		cp.cadastraPessoa(fTres);
		
		Pessoa gUm = new Gerente("JoãoUm", new Data(1, 4, 1985), 5333.0, "area");
		Pessoa gDois = new Gerente("JoãoDois", new Data(1, 4, 1985), 6433.0, "area");
		Pessoa gTres = new Gerente("JoãoTrês", new Data(1, 4, 1985), 36433.6, "area");
		cp.cadastraPessoa(gUm);
		cp.cadastraPessoa(gDois);
		cp.cadastraPessoa(gTres);
		
		Pessoa cUm = new Cliente("ClienteUm", new Data(1, 4, 1985), 1);
		Pessoa cDois = new Cliente("ClienteDois", new Data(1, 4, 1985), 2);
		Pessoa cTres = new Cliente("ClienteTres", new Data(1, 4, 1985), 3);
		cp.cadastraPessoa(cUm);
		cp.cadastraPessoa(cDois);
		cp.cadastraPessoa(cTres);
		
		cp.getPessoas();
		

	}

}
