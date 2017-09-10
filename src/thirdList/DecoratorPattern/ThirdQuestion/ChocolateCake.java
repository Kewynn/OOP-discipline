package thirdList.DecoratorPattern.ThirdQuestion;

public class ChocolateCake implements Bakehouse {

	@Override
	public String getDescription() {
		return "Chocolate Cake";
	}

	@Override
	public double getCost() {
		return 6;
	}

}
