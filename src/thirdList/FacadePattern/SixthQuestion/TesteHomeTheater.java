package thirdList.FacadePattern.SixthQuestion;

public class TesteHomeTheater {

	public static void main(String[] args) {
		DVDPlayer dvd = new DVDPlayer("DVD");
		HomeTheaterFacade ht = new HomeTheaterFacade(new Amplificador("Amplificador", dvd),
				dvd,
				new LuzAmbiente("Luz"),
				new Pipoqueira("Pipoqueira"),
				new Projetor("Projetor", dvd), new Tela("Tela"));
		ht.assistirFilme();
		ht.pararFilme();

	}

}
