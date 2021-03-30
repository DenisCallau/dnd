package items.weapon;

import constants.DamageTypes;
import constants.Dices;
import proficiences.WeaponCategory;

public class Shortsword extends Weapon {
	
	public Shortsword() {
		name = "Shortsword";
		weight = 2;
		price = 10;
		category = WeaponCategory.MARTIAL_MELEE_WEAPON;
		damage = Dices.D6;
		damageType = DamageTypes.PIERCING;
		properties.add(WeaponProperties.FINESSE);
		properties.add(WeaponProperties.LIGHT);
	}	
	

}
