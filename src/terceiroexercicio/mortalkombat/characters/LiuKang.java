package terceiroexercicio.mortalkombat.characters;
import terceiroexercicio.mortalkombat.Fighter;
import terceiroexercicio.mortalkombat.shooterstrategy.DontShoot;
import terceiroexercicio.mortalkombat.shooterstrategy.ShooterBehavior;
import terceiroexercicio.mortalkombat.spellsstrategy.ThrowFireBall;
import terceiroexercicio.mortalkombat.spellsstrategy.WarlockBehavior;

public class LiuKang extends Fighter{

	@Override
	public int throwSpecificSpell() {
		WarlockBehavior a = new ThrowFireBall();
		return a.throwSpell();
		
	}

	@Override
	public int toShoot() {
		ShooterBehavior a = new DontShoot();
		return a.shoot();
	}

	@Override
	public String design() {
		return "Liu Kang";
		
	}

}
