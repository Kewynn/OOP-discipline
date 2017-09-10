package thirdList.DecoratorPattern.FourthQuestion;

public abstract class NumberOneDecorator implements NumberOne {
	protected NumberOne numberOne;

	@Override
	public abstract String print();

}
