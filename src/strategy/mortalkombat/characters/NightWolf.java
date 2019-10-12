package strategy.mortalkombat.characters;

import strategy.mortalkombat.Fighter;
import strategy.mortalkombat.shooterstrategy.ShootWithArrowAndBow;
import strategy.mortalkombat.spellsstrategy.ThrowNothing;

public class NightWolf extends Fighter {

	public NightWolf(){
		warlockBehavior = new ThrowNothing();
		shooterBehavior = new ShootWithArrowAndBow();
	}

	@Override 
	public String design() {
		return "NightWolf";
	}

}
