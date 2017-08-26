package segundalista.uogame;

public class LorigaArmor implements PureWarArmorBehavior {

	@Override
	public int armor(int damage) {
		return damage - 5;
	}

}
