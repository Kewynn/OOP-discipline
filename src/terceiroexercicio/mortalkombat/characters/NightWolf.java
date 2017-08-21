package terceiroexercicio.mortalkombat.characters;

import terceiroexercicio.mortalkombat.Fighter;
import terceiroexercicio.mortalkombat.shooterstrategy.ShootWithArrowAndBow;
import terceiroexercicio.mortalkombat.spellsstrategy.ThrowNothing;

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
