package thirdList.DecoratorPattern.ThirdQuestion.CakesFruit;

import thirdList.DecoratorPattern.ThirdQuestion.Bakehouse;

public class PeachFruitDecorator extends CakesFruitDecorator {
	
	public PeachFruitDecorator(Bakehouse bakehouse) {
		super.bakehouse = bakehouse;
		super.decoratorDescription = "Peach Fruit";
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
