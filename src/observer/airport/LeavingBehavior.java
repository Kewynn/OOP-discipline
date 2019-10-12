package observer.airport;

public class LeavingBehavior implements FlightBehavior{

	@Override
	public String behavior() {
		return "The flight is leaving.";
	}

}
