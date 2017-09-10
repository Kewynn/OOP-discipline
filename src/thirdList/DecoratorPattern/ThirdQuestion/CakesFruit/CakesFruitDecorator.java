package thirdList.DecoratorPattern.ThirdQuestion.CakesFruit;

import thirdList.DecoratorPattern.ThirdQuestion.Bakehouse;

public abstract class CakesFruitDecorator implements Bakehouse {
	protected Bakehouse bakehouse;
	protected String decoratorDescription;

	@Override
	public abstract String getDescription();


	@Override
	public abstract double getCost();

}
