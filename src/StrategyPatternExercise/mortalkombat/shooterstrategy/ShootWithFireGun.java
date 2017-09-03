package StrategyPatternExercise.mortalkombat.shooterstrategy;

public class ShootWithFireGun implements ShooterBehavior{

	@Override
	public int shoot() {
		return 20;
	}

}
