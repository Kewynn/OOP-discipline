package secondList.Airport;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class ConcreteTotem implements Totem{
	private List<Flight> flights;
	private String number;
	
	public ConcreteTotem(){
		this.flights = new ArrayList<Flight>();
		this.number = "";
	}
	@Override
	public void addFlight(Flight f){
		this.flights.add(f);
		update();
	}

	@Override
	public void update() {
		String changes = "*NEW FLIGHT CHANGES*\n\n";
		for(Flight f: flights){
			changes+= f.getDestiny()+"\n";
			changes+= f.getEnterprise()+"\n";
			changes+= f.getHorary()+"\n";
			changes+= f.getNumberFlight()+"\n\n";
		}
		JOptionPane.showMessageDialog(null, changes);;
		
	}
	@Override
	public void setNumber(String number) {
		this.number = number;
	}
	@Override
	public String getNumber() {
		return number;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConcreteTotem other = (ConcreteTotem) obj;
		if (flights == null) {
			if (other.flights != null)
				return false;
		} else if (!flights.equals(other.flights))
			return false;
		return true;
	}
	
	
	

}
