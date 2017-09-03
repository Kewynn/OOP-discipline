package secondList.Airport;

public class Flight extends AirportDeparture{
	private String destiny;
	private String numberFlight;
	private String enterprise;
	private String horary;
	private FlightBehavior flightBehavior;
	
	public Flight(String destiny, String numberFlight, String enterprise, String horary,
			FlightBehavior flightBehavior) {
		this.destiny = destiny;
		this.numberFlight = numberFlight;
		this.enterprise = enterprise;
		this.horary = horary;
		this.flightBehavior = flightBehavior;
	}

	@Override
	public boolean equals(Object obj){
		if(obj == null){
			return false;
		}if(obj instanceof Flight){
			Flight f = (Flight) obj;
			if(this.destiny == f.getDestiny() &&
					this.enterprise == f.getEnterprise() &&
					this.horary == f.getHorary() &&
					this.numberFlight == f.getNumberFlight()){
				return true;
			}
		}return false;
	}
	public String getDestiny() {
		return destiny;
	}
	public void setDestiny(String destiny) {
		this.destiny = destiny;
		notifyTotem();
	}

	public String getNumberFlight() {
		return numberFlight;
	}

	public void setNumberFlight(String numberFlight) {
		this.numberFlight = numberFlight;
		notifyTotem();
	}

	public String getEnterprise() {
		return enterprise;
	}

	public void setEnterprise(String enterprise) {
		this.enterprise = enterprise;
		notifyTotem();
	}

	public String getHorary() {
		return horary;
	}

	public void setHorary(String horary) {
		this.horary = horary;
		notifyTotem();
	}
	public FlightBehavior getFlightBehavior() {
		return flightBehavior;
	}

	
	
	

	
	

}
