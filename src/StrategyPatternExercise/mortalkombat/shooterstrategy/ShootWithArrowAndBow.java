package StrategyPatternExercise.mortalkombat.shooterstrategy;

public class ShootWithArrowAndBow implements ShooterBehavior {
	
	@Override
	public int shoot() {
		return 20;
	}

}
