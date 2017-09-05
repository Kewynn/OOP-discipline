package decoratorPattern.CoffeeTypes;

import decoratorPattern.Drink;

public class TraditionalCoffee implements Drink{

	@Override
	public String getDescription() {
		return "Traditional Coffee";
	}

	@Override
	public double getCost() {
		return 1;
	}

}
