package items.weapon;

import constants.DamageTypes;
import constants.Dices;
import proficiences.WeaponCategory;

public class Whip extends Weapon {
	
	public Whip() {
		name = "Whip";
		weight = 3;
		price = 2;
		category = WeaponCategory.MARTIAL_MELEE_WEAPON;
		damage = Dices.D4;
		damageType = DamageTypes.SLASHING;
		properties.add(WeaponProperties.FINESSE);
		properties.add(WeaponProperties.REACH);
	}	
	

}
