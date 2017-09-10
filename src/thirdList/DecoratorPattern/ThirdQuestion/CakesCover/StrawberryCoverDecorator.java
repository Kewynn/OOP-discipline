package thirdList.DecoratorPattern.ThirdQuestion.CakesCover;

import thirdList.DecoratorPattern.ThirdQuestion.Bakehouse;

public class StrawberryCoverDecorator extends CakesCoverDecorator {
	
	public StrawberryCoverDecorator(Bakehouse bakehouse) {
		super.bakehouse = bakehouse;
		super.decoratorDescription = "Strawberry Cover";
	}

	@Override
	public String getDescription() {
		return bakehouse.getDescription() + " with " + decoratorDescription;
	}

	@Override
	public double getCost() {
		return bakehouse.getCost() + 1;
	}

}
