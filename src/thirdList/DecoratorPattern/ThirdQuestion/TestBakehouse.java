package thirdList.DecoratorPattern.ThirdQuestion;

import thirdList.DecoratorPattern.ThirdQuestion.CakesCover.ChocolateCoverDecorator;
import thirdList.DecoratorPattern.ThirdQuestion.CakesCover.MilkCandyCoverDecorator;
import thirdList.DecoratorPattern.ThirdQuestion.CakesCover.StrawberryCoverDecorator;
import thirdList.DecoratorPattern.ThirdQuestion.CakesFruit.BlackberryFruitDecorator;
import thirdList.DecoratorPattern.ThirdQuestion.CakesFruit.PeachFruitDecorator;

public class TestBakehouse {

	public static void main(String[] args) {
		
		Bakehouse chocolateCake = new ChocolateCake();
		Bakehouse lemonCake = new LemonCake();
		Bakehouse orangeCake = new OrangeCake();
		
		chocolateCake = new MilkCandyCoverDecorator(chocolateCake);
		lemonCake = new ChocolateCoverDecorator(lemonCake);
		orangeCake = new StrawberryCoverDecorator(orangeCake);
		
		chocolateCake = new BlackberryFruitDecorator(chocolateCake);
		lemonCake = new PeachFruitDecorator(lemonCake);
		orangeCake = new StrawberryCoverDecorator(orangeCake);
		
		System.out.println("Description: " + chocolateCake.getDescription());
		System.out.println("Cost: " + chocolateCake.getCost());
		
		System.out.println("Description: " + lemonCake.getDescription());
		System.out.println("Cost: " + lemonCake.getCost());
		
		System.out.println("Description: " + orangeCake.getDescription());
		System.out.println("Cost: " + orangeCake.getCost());

	}

}
