package primeiromodulo.questao3;

public class Ponto {
	private int cordenadaX;
	private int cordenadaY;
	
	public Ponto(){
		this.cordenadaX = 0;
		this.cordenadaY = 0;
	}
	
	public Ponto(int cordenadaX, int cordenadaY) {

		this.cordenadaX = cordenadaX;
		this.cordenadaY = cordenadaY;
	}
	public int getCordenadaX() {
		return cordenadaX;
	}
	public void setCordenadaX(int cordenadaX) {
		this.cordenadaX = cordenadaX;
	}
	public int getCordenadaY() {
		return cordenadaY;
	}
	public void setCordenadaY(int cordenadaY) {
		this.cordenadaY = cordenadaY;
	}
	
	public String toString() {
		return "Ponto [cordenadaX=" + cordenadaX + ", cordenadaY=" + cordenadaY + "]";
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Ponto))
			return false;
		Ponto other = (Ponto) obj;
		if (cordenadaX != other.cordenadaX)
			return false;
		if (cordenadaY != other.cordenadaY)
			return false;
		return true;
	}
	
	

	
	
	
	

}
