package thirdList.DecoratorPattern.ThirdQuestion;

public class OrangeCake implements Bakehouse {

	@Override
	public String getDescription() {
		return "Orange Cake";
	}

	@Override
	public double getCost() {
		return 5;
	}

}
