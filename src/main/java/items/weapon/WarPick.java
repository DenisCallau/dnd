package items.weapon;

import constants.DamageTypes;
import constants.Dices;
import proficiences.WeaponCategory;

public class WarPick extends Weapon {
	
	public WarPick() {
		name = "War Pick";
		weight = 2;
		price = 5;
		category = WeaponCategory.MARTIAL_MELEE_WEAPON;
		damage = Dices.D8;
		damageType = DamageTypes.PIERCING;
	}	
	

}
