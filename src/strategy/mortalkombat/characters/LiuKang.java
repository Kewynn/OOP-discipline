package strategy.mortalkombat.characters;
import strategy.mortalkombat.Fighter;
import strategy.mortalkombat.shooterstrategy.DontShoot;
import strategy.mortalkombat.spellsstrategy.ThrowFireBall;


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
