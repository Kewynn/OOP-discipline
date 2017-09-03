package secondListObserverAndStrategy.UOGame;

public class TitaniumArmor implements PureWarArmorBehavior {

	@Override
	public int armor(int damage) {
		return damage - 15;
	}

}
