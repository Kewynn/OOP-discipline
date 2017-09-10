package thirdList.DecoratorPattern.ThirdQuestion;

public class VanillaCake implements Bakehouse {

	@Override
	public String getDescription() {
		return "Vanilla Cake";
	}

	@Override
	public double getCost() {
		return 3;
	}

}
