package thirdList.FacadePattern.SixthQuestion;

public class HomeTheaterFacade {
	
	private Amplificador amplificador;
	private DVDPlayer dvdplayer;
	private LuzAmbiente luzAmbiente;
	private Pipoqueira pipoqueira;
	private Projetor projetor;
	private Tela tela;
	
	public HomeTheaterFacade(Amplificador amplificador,
			DVDPlayer dvdplayer,
			LuzAmbiente luzAmbiente,
			Pipoqueira pipoqueira,
			Projetor projetor,
			Tela tela) {
		this.amplificador = amplificador;
		this.dvdplayer = dvdplayer;
		this.luzAmbiente = luzAmbiente;
		this.pipoqueira = pipoqueira;
		this.projetor = projetor;
		this.tela = tela;
	}
	public void assistirFilme(){
		System.out.println("Tudo ok para assistir filme.");
		pipoqueira.on();
		pipoqueira.fazerPipoca();
		
		luzAmbiente.luminosidadeMedia();
		tela.descer();
		
		projetor.on();
		projetor.modoWideScreen();
		
		amplificador.on();
		amplificador.somStereo();
		amplificador.setVolume(10);
		
		dvdplayer.on();
		dvdplayer.play("filme");
		
	}
	public void pararFilme(){
		System.out.println("Desligando..");
		pipoqueira.off();
		luzAmbiente.on();
		tela.subir();
		projetor.off();
		amplificador.off();
		dvdplayer.stop();
		dvdplayer.eject();
		dvdplayer.off();
		
	}
	
	
	

}
