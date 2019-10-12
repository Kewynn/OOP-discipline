package decorator.decorators;

import decorator.Drink;

public class CreamDecorator extends DrinkDecorator{
	
	public CreamDecorator(Drink drink){
		super.drink = drink;
		super.decoratorDescription = "Cream";
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
