package decorator.decorators;

import decorator.Drink;

public class ChocolateDecorator extends DrinkDecorator{
	
	public ChocolateDecorator(Drink drink){
		super.drink = drink;
		super.decoratorDescription = "Chocolate";
		
	}
	@Override
	public String getDescription() {
		return drink.getDescription() + " with " + decoratorDescription;
	}
	@Override
	public double getCost() {
		return drink.getCost() + 3;
	}

}
