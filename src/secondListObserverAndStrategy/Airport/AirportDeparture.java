package secondListObserverAndStrategy.Airport;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class AirportDeparture implements Airport{
	private List<ConcreteTotem> totems;
	private List<Flight> flights;
	
	
	public AirportDeparture(List<ConcreteTotem> totems, List<Flight> flights) {
		this.totems = totems;
		this.flights = flights;
	}
	public AirportDeparture() {
		this.totems = new ArrayList<ConcreteTotem>();
		this.flights = new ArrayList<Flight>();
	}

	@Override
	public void removeTotem(String totem) {
		Iterator<ConcreteTotem> iterator = totems.iterator();
		while(iterator.hasNext()){
			ConcreteTotem co = iterator.next();
			if(co.getNumber().equals(totem))
				iterator.remove();
		}
	
		
	}

	@Override
	public void addTotem(Totem totem) {
		this.totems.add((ConcreteTotem) totem);
		
	}

	@Override
	public void notifyTotem() {
		for(Totem t: totems){
			t.update();
		}
		
	}
	@Override
	public void addFlightToTotem(){
		for(Totem t: this.totems){
			for(Flight f: this.flights){
				t.addFlight(f);
			}
		}
	}
	@Override
	public void addFlight(Flight f){
		this.flights.add(f);
		notifyTotem();
	}
	@Override
	public void removeFlight(String flightN){

		Iterator<Flight> iterator = flights.iterator();
		while(iterator.hasNext()){
			Flight co = iterator.next();
			if(co.getNumberFlight().equals(flightN)){
				iterator.remove();
				addFlightToTotem();
				notifyTotem();

			}
		}
	}

}
