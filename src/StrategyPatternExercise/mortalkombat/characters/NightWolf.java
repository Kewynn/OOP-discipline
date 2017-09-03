package StrategyPatternExercise.mortalkombat.characters;

import StrategyPatternExercise.mortalkombat.Fighter;
import StrategyPatternExercise.mortalkombat.shooterstrategy.ShootWithArrowAndBow;
import StrategyPatternExercise.mortalkombat.spellsstrategy.ThrowNothing;

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
