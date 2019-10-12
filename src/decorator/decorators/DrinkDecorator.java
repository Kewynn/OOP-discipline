package decorator.decorators;

import decorator.Drink;

public abstract class DrinkDecorator implements Drink{
	protected Drink drink;
	protected String decoratorDescription;

	@Override
	public abstract String getDescription();

	@Override
	public abstract double getCost();

}
