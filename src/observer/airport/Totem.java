package observer.airport;

public interface Totem {
	public void update();
	public void addFlight(Flight f);
	public String getNumber();
	public void setNumber(String n);

}
