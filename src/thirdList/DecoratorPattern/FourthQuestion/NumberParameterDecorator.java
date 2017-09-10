package thirdList.DecoratorPattern.FourthQuestion;

public class NumberParameterDecorator extends NumberOneDecorator {
	
	public NumberParameterDecorator(NumberOne numberOne) {
		super.numberOne = numberOne;
	}

	@Override
	public String print() {
		return "("+numberOne.print()+")";
	}

}
