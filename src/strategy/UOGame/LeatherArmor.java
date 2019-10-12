package strategy.UOGame;

public class LeatherArmor implements PureWarArmorBehavior {

	@Override
	public int armor(int damage) {
		return damage - 2;

	}

}
