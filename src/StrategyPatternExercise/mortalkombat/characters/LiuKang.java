package StrategyPatternExercise.mortalkombat.characters;
import StrategyPatternExercise.mortalkombat.Fighter;
import StrategyPatternExercise.mortalkombat.shooterstrategy.DontShoot;
import StrategyPatternExercise.mortalkombat.spellsstrategy.ThrowFireBall;


public class LiuKang extends Fighter{
	
	public LiuKang(){
		warlockBehavior = new ThrowFireBall();
		shooterBehavior = new DontShoot();
	}


	@Override
	public String design() {
		return "Liu Kang";
		
	}

}
