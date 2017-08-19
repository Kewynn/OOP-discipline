package primeiroexercicio.questao3;

public class Ponto {
	private int cordenadaX;
	private int cordenadaY;
	
	public Ponto(int cordenadaX, int cordenadaY) {

		this.cordenadaX = cordenadaX;
		this.cordenadaY = cordenadaY;
	}
	public Ponto(){
		this.cordenadaX = 0;
		this.cordenadaY = 0;
	}
	

	public int getCordenadaX() {
		return this.cordenadaX;
	}
	public void setCordenadaX(int cordenadaX) {
		this.cordenadaX = cordenadaX;
	}
	public int getCordenadaY() {
		return this.cordenadaY;
	}
	public void setCordenadaY(int cordenadaY) {
		this.cordenadaY = cordenadaY;
	}
	
	public String toString() {
		return "Ponto [cordenadaX=" + cordenadaX + ", cordenadaY=" + cordenadaY + "]";
	}
	
	public boolean equals(Object obj) {
		if(obj == null){
			return false;
		}
		if(obj instanceof Ponto){
			Ponto p = (Ponto) obj;
			if(this.cordenadaX == p.getCordenadaX() && this.cordenadaY == p.getCordenadaY()){
				return true;
			}
		}return false;
	}
	
	

	
	
	
	

}
