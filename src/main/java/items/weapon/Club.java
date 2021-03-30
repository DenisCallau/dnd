package items.weapon;

import constants.DamageTypes;
import constants.Dices;
import proficiences.WeaponCategory;

public class Club extends Weapon {
	
	public Club() {
		name = "Club";
		weight = 2;
		price = 0.1;
		category = WeaponCategory.SIMPLE_MELEE_WEAPON;
		damage = Dices.D4;
		damageType = DamageTypes.BLUDGEONING;
		properties.add(WeaponProperties.LIGHT);		
	}

}
