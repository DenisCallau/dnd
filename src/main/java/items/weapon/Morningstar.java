package items.weapon;

import constants.DamageTypes;
import constants.Dices;
import proficiences.WeaponCategory;

public class Morningstar extends Weapon {
	
	public Morningstar() {
		name = "Morningstar";
		weight = 4;
		price = 15;
		category = WeaponCategory.MARTIAL_MELEE_WEAPON;
		damage = Dices.D8;
		damageType = DamageTypes.PIERCING;
	}	
	

}
