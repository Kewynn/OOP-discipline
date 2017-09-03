package secondList.Airport;

public interface Airport {
	
	public void removeTotem(String totem);
	public void addTotem(Totem totem);
	public void notifyTotem();
	public void addFlight(Flight f);
	public void removeFlight(String f);
	public void addFlightToTotem();

}
