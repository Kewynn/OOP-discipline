package observer.airport;

public class ArrivingBehavior implements FlightBehavior{

	@Override
	public String behavior() {
		return "The flight is arriving.";
		
		
	}

}
