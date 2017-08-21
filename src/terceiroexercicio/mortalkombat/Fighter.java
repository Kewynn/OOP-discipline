package terceiroexercicio.mortalkombat;

import terceiroexercicio.mortalkombat.shooterstrategy.ShooterBehavior;
import terceiroexercicio.mortalkombat.spellsstrategy.WarlockBehavior;

public abstract class Fighter {
	protected ShooterBehavior shooterBehavior;
	protected WarlockBehavior warlockBehavior;
	protected int life;

	public Fighter() {
		this.life = 100;
	}

	public void toPunch(Fighter f) {
		f.damageReceived(5);
	}

	public void toKick(Fighter f) {
		f.damageReceived(10);
	}

	public void toDefend(int damage) {

	}

	public int getLife() {
		return life;
	}

	public void toJump() {
	}

	public void throwSpecificSpell(Fighter f) {
		f.damageReceived(this.warlockBehavior.throwSpell());
	}

	public void toShoot(Fighter f) {
		f.damageReceived(f.getLife() - this.shooterBehavior.shoot());
	}

	public abstract String design();

	public boolean isDead() {
		if (this.life < 0) {
			return true;
		}
		return false;
	}

	public String damageReceived(int damage) {
		if ((life - damage) < 0) {
			life -= damage;
			return "The person is dead!";
		} else {
			life -= damage;
			return "Damage received(-" + damage + ") " + "Life(" + this.life + ")";
		}
	}
}
