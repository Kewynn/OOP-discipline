package terceiroexercicio.mortalkombat;

import terceiroexercicio.mortalkombat.shooterstrategy.ShooterBehavior;
import terceiroexercicio.mortalkombat.spellsstrategy.WarlockBehavior;

public abstract class Fighter {
	protected ShooterBehavior shooterBehavior;
	protected WarlockBehavior warlockBehavior;
	protected int life;
	
	public Fighter(){
		this.life = 100;
	}

	public int toPunch() {
		return 5;
	}

	public int toKick() {
		return 10;
	}

	public void toDefend(int damage) {
		
	}

	public void toJump() {
	}

	public abstract int throwSpecificSpell();

	public abstract int toShoot();
	
	public abstract String design();
	
	public boolean isDead(){
		if(this.life < 0){
			return true;
		}return false;
	}

	public String damageReceived(int damage){
		if((life - damage) < 0){
			life-=damage;
			return "The person is dead!";
		}else{
			life-=damage;
			return "Damage received(-"+damage+") "+"Life("+this.life+")" ;
		}
	}
}
