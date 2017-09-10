package thirdList.DecoratorPattern.ThirdQuestion.CakesCover;

import thirdList.DecoratorPattern.ThirdQuestion.Bakehouse;

public class MilkCandyCoverDecorator extends CakesCoverDecorator {

	public MilkCandyCoverDecorator(Bakehouse bakehouse) {
		super.bakehouse = bakehouse;
		super.decoratorDescription = "Milk Candy Cover";
	}

	@Override
	public String getDescription() {
		return bakehouse.getDescription() + " with " + decoratorDescription;
	}

	@Override
	public double getCost() {
		return bakehouse.getCost() + 1.50;
	}

}
