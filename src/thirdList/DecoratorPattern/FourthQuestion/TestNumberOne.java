package thirdList.DecoratorPattern.FourthQuestion;

public class TestNumberOne {

	public static void main(String[] args) {
		NumberOne numberOne = new NumberOneClass();
		numberOne = new NumberParameterDecorator(numberOne);
		System.out.println(numberOne.print());
		numberOne = new NumberBracketsDecorator(numberOne);
		System.out.println(numberOne.print());
		numberOne = new NumberKeysDecorator(numberOne);
		System.out.println(numberOne.print());
		numberOne = new NumberBracketsDecorator(numberOne);
		System.out.println(numberOne.print());
		

	}

}
