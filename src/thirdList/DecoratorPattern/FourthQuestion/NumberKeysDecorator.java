package thirdList.DecoratorPattern.FourthQuestion;

public class NumberKeysDecorator extends NumberOneDecorator {
	
	public NumberKeysDecorator(NumberOne numberOne) {
		super.numberOne = numberOne;
	}

	@Override
	public String print() {
		return "{"+numberOne.print()+"}";
	}

}
