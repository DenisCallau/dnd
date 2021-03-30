package items.weapon;

import constants.DamageTypes;
import constants.Dices;
import proficiences.WeaponCategory;

public class Rapier extends Weapon {
	
	public Rapier() {
		name = "Rapier";
		weight = 2;
		price = 25;
		category = WeaponCategory.MARTIAL_MELEE_WEAPON;
		damage = Dices.D8;
		damageType = DamageTypes.PIERCING;
		properties.add(WeaponProperties.FINESSE);
	}	
	

}
