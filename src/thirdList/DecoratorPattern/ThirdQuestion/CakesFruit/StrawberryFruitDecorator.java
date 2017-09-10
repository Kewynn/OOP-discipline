package thirdList.DecoratorPattern.ThirdQuestion.CakesFruit;

import thirdList.DecoratorPattern.ThirdQuestion.Bakehouse;

public class StrawberryFruitDecorator extends CakesFruitDecorator {
	
	public StrawberryFruitDecorator(Bakehouse bakehouse) {
		super.bakehouse = bakehouse;
		super.decoratorDescription = "StrawBerry Fruit";
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
