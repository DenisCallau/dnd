package items.weapon;

import constants.DamageTypes;
import constants.Dices;
import proficiences.WeaponCategory;

public class Flail extends Weapon {
	
	public Flail() {
		name = "Flail";
		weight = 2;
		price = 10;
		category = WeaponCategory.MARTIAL_MELEE_WEAPON;
		damage = Dices.D8;
		damageType = DamageTypes.BLUDGEONING;
	}

}
