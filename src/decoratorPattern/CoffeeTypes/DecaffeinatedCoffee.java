package decoratorPattern.CoffeeTypes;

import decoratorPattern.Drink;

public class DecaffeinatedCoffee implements Drink{

	@Override
	public String getDescription() {
		return "Decaffeinated Coffee";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 3;
	}

}
