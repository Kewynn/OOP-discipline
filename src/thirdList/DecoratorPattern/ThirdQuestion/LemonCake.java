package thirdList.DecoratorPattern.ThirdQuestion;

public class LemonCake implements Bakehouse{

	@Override
	public String getDescription() {
		return "Lemon Cake";
	}

	@Override
	public double getCost() {
		return 5;
	}

}
