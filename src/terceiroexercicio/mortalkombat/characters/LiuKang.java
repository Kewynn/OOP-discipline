package terceiroexercicio.mortalkombat.characters;
import terceiroexercicio.mortalkombat.Fighter;
import terceiroexercicio.mortalkombat.shooterstrategy.DontShoot;
import terceiroexercicio.mortalkombat.spellsstrategy.ThrowFireBall;


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
