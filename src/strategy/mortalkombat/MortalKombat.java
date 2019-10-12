package strategy.mortalkombat;

import strategy.mortalkombat.characters.LiuKang;
import strategy.mortalkombat.characters.NightWolf;

public class MortalKombat {

	public static void main(String[] args) {
		Fighter playerOne = new LiuKang(), playerTwo = new NightWolf();
		System.out.println("Character: " + playerOne.design() + " \nLife: " + playerOne.getLife() + "\n");
		System.out.println("Character: " + playerTwo.design() + " \nLife: " + playerTwo.getLife() + "\n");

		playerOne.throwSpecificSpell(playerTwo);
		System.out.println("Character: " + playerOne.design() + " \nLife: " + playerOne.getLife() + "\n");
		System.out.println("Character: " + playerTwo.design() + " \nLife: " + playerTwo.getLife() + "\n");

		playerTwo.toPunch(playerOne);
		System.out.println("Character: " + playerOne.design() + " \nLife: " + playerOne.getLife() + "\n");
		System.out.println("Character: " + playerTwo.design() + " \nLife: " + playerTwo.getLife() + "\n");

	}

}
