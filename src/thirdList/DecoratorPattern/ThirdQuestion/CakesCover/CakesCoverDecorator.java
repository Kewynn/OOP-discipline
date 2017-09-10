package thirdList.DecoratorPattern.ThirdQuestion.CakesCover;

import thirdList.DecoratorPattern.ThirdQuestion.Bakehouse;

public abstract class CakesCoverDecorator implements Bakehouse {
	protected Bakehouse bakehouse;
	protected String decoratorDescription;

	@Override
	public abstract String getDescription();

	@Override
	public abstract double getCost();

}
