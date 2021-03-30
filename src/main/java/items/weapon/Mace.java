package items.weapon;

import constants.DamageTypes;
import constants.Dices;
import proficiences.WeaponCategory;

public class Mace extends Weapon {
	
	public Mace() {
		name = "Mace";
		weight = 4;
		price = 5;
		category = WeaponCategory.SIMPLE_MELEE_WEAPON;
		damage = Dices.D6;
		damageType = DamageTypes.BLUDGEONING;
	}

}
