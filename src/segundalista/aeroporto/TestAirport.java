package segundalista.aeroporto;



import javax.swing.JOptionPane;

public class TestAirport {
	public static void main(String[] args){
		boolean exit = true;
		Airport departure = new AirportDeparture();
		Airport arrival = new AirportArrival();
		while(exit){
			String var = JOptionPane.showInputDialog("1.Add Totem\n"
					+ "2.Add Flight\n"
					+ "3.Remove Totem\n"
					+ "4.Remove Flight\n"
					+ "5.Departure informations\n"
					+ "6.Arrival informations\n"
					+ "7.Exit");
			switch (var){
				case "1":
					Totem t = new ConcreteTotem();
					String departureOrArrival = JOptionPane.showInputDialog(
							"You would like to put the Totem on 1. Departure or 2. Arrival or 3. Both?");
					t.setNumber(JOptionPane.showInputDialog("Totem number: "));
					switch (departureOrArrival){
					case "1":
						departure.addTotem(t);
						departure.addFlightToTotem();
						JOptionPane.showMessageDialog(null, "DONE!");
						break;
					case "2":
						arrival.addTotem(t);
						JOptionPane.showMessageDialog(null, "DONE!");
						arrival.addFlightToTotem();
						break;
					case "3":
						arrival.addTotem(t);
						departure.addTotem(t);
						departure.addFlightToTotem();
						arrival.addFlightToTotem();
						JOptionPane.showMessageDialog(null, "DONE!");
					}
					break;
				case "2":
					String destiny = JOptionPane.showInputDialog("What is the destination? ");
					String number = JOptionPane.showInputDialog("Flight number? ");
					String enterprise = JOptionPane.showInputDialog("Enterprise name? ");
					String horary = JOptionPane.showInputDialog("Horary?");
					String flightBehavior = JOptionPane.showInputDialog("The flight is 1.Arriving or 2.Leaving?");
					FlightBehavior fb;
					Flight f;
					switch(flightBehavior){
						case "1":
							fb = new ArrivingBehavior();
							f = new Flight(destiny, number, enterprise, horary, fb);
							arrival.addFlight(f);
							arrival.addFlightToTotem();
							break;
						case "2":
							fb = new LeavingBehavior();
							f = new Flight(destiny, number, enterprise, horary, fb);
							departure.addFlight(f);
							departure.addFlightToTotem();
							break;
					}
					break;
				case "3":
					
					String adb = JOptionPane.showInputDialog("Would like to remove of 1. Departure or 2. Arrival or 3. Both");
					String identifier = JOptionPane.showInputDialog("Totem's number: ");
					switch (adb){
						case "1":
							departure.removeTotem(identifier);
							JOptionPane.showMessageDialog(null, "DONE!");
							break;
						case "2":	
							arrival.removeTotem(identifier);
							JOptionPane.showMessageDialog(null, "DONE!");
							break;
						case "3":
							departure.removeTotem(identifier);
							arrival.removeTotem(identifier);
							JOptionPane.showMessageDialog(null, "DONE!");
							break;
							
					}
					break;
				case "4":
					String place = JOptionPane.showInputDialog("Would like to remove the flight from 1. Departure totems or "
							+ "2. Arrival totems or "
							+ "3. Both");
					String flightNumber = JOptionPane.showInputDialog("Flight number?");
					switch(place){
					case "1":
						departure.removeFlight(flightNumber);
						
						break;
					case "2":
						arrival.removeFlight(flightNumber);
						
						break;
					case "3":
						departure.removeFlight(flightNumber);
						arrival.removeFlight(flightNumber);
						
						break;
					}
					break;
				case "5":
					departure.notifyTotem();
					break;
				case "6":
					arrival.notifyTotem();
					break;
				case "7":
					exit = false;
					
						
					
				
					break;
					
				
					
			}
		}
		
	
	}


}
