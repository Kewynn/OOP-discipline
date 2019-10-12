package strategy.UOGame;

public class Test {

	public static void main(String[] args) {
		PureWarrior playerOne = new PureWarrior("PlayerOne", 100, new LorigaArmor(), new HalberdAttack());
		PureWarrior playerTwo = new PureWarrior("PlayerTwo", 100, new TitaniumArmor(), new KatanaAttack());
		
		playerOne.setLife(playerTwo, playerTwo.toAttack());
		System.out.println(playerTwo.getLife());
		System.out.println(playerOne.getLife());
		playerTwo.setLife(playerOne, playerOne.toAttack());
		System.out.println(playerOne.getLife());
		System.out.println(playerTwo.getLife());
		playerTwo.toDefend(playerOne.toAttack());
		System.out.println(playerTwo.getLife());

	}

}
