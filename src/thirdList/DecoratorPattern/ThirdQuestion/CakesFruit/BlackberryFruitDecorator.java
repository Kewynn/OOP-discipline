package thirdList.DecoratorPattern.ThirdQuestion.CakesFruit;

import thirdList.DecoratorPattern.ThirdQuestion.Bakehouse;

public class BlackberryFruitDecorator extends CakesFruitDecorator {
	
	public BlackberryFruitDecorator(Bakehouse bakehouse) {
		super.bakehouse = bakehouse;
		super.decoratorDescription = "Blackberry Fruit";
	}

	@Override
	public String getDescription() {
		return bakehouse.getDescription() + " with " + decoratorDescription;
	}

	@Override
	public double getCost() {
		return bakehouse.getCost() + 2;
	}

}
