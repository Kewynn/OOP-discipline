package secondList.UOGame;

public class PureWarrior {
	private String name;
	private int life;
	private PureWarArmorBehavior armorBehavior;
	private PureWarWeaponBehavior weaponBehavior;
	
	public PureWarrior(String name, int life, PureWarArmorBehavior armorBehavior, PureWarWeaponBehavior weaponBehavior) {
		this.name = name;
		this.life = life;
		this.armorBehavior = armorBehavior;
		this.weaponBehavior = weaponBehavior;
	}
	public String getName() {
		return this.name;
	}
	public int getLife() {
		return this.life;
	}
	public void setLife(PureWarrior pw, int dmg) {
		pw.life -= dmg;
	}
	public void toDefend(int damage){
		this.life -= armorBehavior.armor(damage);
	}
	/*public void toAttack(PureWarrior pw){
		pw.setLife(pw.life -= weaponBehavior.weaponAttack());
	}*/
	public int toAttack(){
		return weaponBehavior.weaponAttack();
	}
	
	
	
	

}
