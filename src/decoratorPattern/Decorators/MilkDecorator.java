package decoratorPattern.Decorators;

import decoratorPattern.Drink;

public class MilkDecorator extends DrinkDecorator{
	
	public MilkDecorator(Drink drink){
		super.drink = drink;
		super.decoratorDescription = "Milk";
	}

	@Override
	public String getDescription() {
		return drink.getDescription() + " with " + decoratorDescription;
	}

	@Override
	public double getCost() {
		return drink.getCost() + 2;
	}

}
