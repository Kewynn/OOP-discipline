package decorator.coffeeTypes;

import decorator.Drink;

public class TraditionalCoffee implements Drink{

	@Override
	public String getDescription() {
		return "Traditional Coffee";
	}

	@Override
	public double getCost() {
		return 2;
	}

}
