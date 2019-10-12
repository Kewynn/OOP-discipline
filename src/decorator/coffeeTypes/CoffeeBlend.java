package decorator.coffeeTypes;

import decorator.Drink;

public class CoffeeBlend implements Drink{

	@Override
	public String getDescription() {
		return "Coffee Blend";
	}

	@Override
	public double getCost() {
		return 3;
	}

}
