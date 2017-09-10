package thirdList.DecoratorPattern.FourthQuestion;

public class NumberBracketsDecorator extends NumberOneDecorator{
	
	public NumberBracketsDecorator(NumberOne numberOne) {
		super.numberOne = numberOne;
	}

	@Override
	public String print() {
		return "["+numberOne.print()+"]";
	}

}
