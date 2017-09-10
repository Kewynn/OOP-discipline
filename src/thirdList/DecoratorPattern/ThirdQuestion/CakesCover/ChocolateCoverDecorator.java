package thirdList.DecoratorPattern.ThirdQuestion.CakesCover;

import thirdList.DecoratorPattern.ThirdQuestion.Bakehouse;

public class ChocolateCoverDecorator extends CakesCoverDecorator {
	
	public ChocolateCoverDecorator(Bakehouse bakehouse) {
		super.bakehouse = bakehouse;
		super.decoratorDescription = "Chocolate Cover";
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
